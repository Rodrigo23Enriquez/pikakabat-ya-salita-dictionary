package org.sticollegeandroidprojects.dictionary.Fragment;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;
import org.sticollegeandroidprojects.dictionary.Activity.ActivityWordList;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMRecent;

import java.util.List;

public class Fragment_RecentWords extends Fragment {

    private VMRecent mViewModel;

    public static Fragment_RecentWords newInstance() {
        return new Fragment_RecentWords();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(VMRecent.class);
        View view = inflater.inflate(R.layout.fragment_recent_words, container, false);

        //ASC for list sorted on ascending order, else DESC for descending order.
        //Fragment nakikishare lang ng context sa activity container.
        mViewModel.GetRecents().observe(requireActivity(), new Observer<List<RWord.RecentWord>>() {
            @Override
            public void onChanged(List<RWord.RecentWord> recentWords) {
                try{

                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        return view;
    }
}