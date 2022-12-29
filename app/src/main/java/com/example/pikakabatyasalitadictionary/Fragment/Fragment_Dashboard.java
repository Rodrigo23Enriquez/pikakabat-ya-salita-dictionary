package com.example.pikakabatyasalitadictionary.Fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pikakabatyasalitadictionary.R;
import com.example.pikakabatyasalitadictionary.ViewModel.VMDashboard;

public class Fragment_Dashboard extends Fragment {

    private VMDashboard mViewModel;

    public static Fragment_Dashboard newInstance() {
        return new Fragment_Dashboard();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(VMDashboard.class);
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

}