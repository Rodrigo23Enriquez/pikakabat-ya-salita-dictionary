package org.sticollegeandroidprojects.dictionary.Fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMWordList;

public class Fragment_WordList extends Fragment {

    private VMWordList mViewModel;

    public static Fragment_WordList newInstance() {
        return new Fragment_WordList();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(VMWordList.class);
        return inflater.inflate(R.layout.fragment_word_list, container, false);
    }
}