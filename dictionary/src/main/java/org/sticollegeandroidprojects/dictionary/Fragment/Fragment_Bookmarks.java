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
import org.sticollegeandroidprojects.dictionary.ViewModel.VMBookmarks;

public class Fragment_Bookmarks extends Fragment {

    private VMBookmarks mViewModel;

    public static Fragment_Bookmarks newInstance() {
        return new Fragment_Bookmarks();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(VMBookmarks.class);
        return inflater.inflate(R.layout.fragment_bookmarks, container, false);
    }
}