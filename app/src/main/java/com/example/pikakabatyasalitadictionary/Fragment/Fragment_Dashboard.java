package com.example.pikakabatyasalitadictionary.Fragment;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pikakabatyasalitadictionary.Activity.Activity_Home;
import com.example.pikakabatyasalitadictionary.R;
import com.example.pikakabatyasalitadictionary.ViewModel.VMDashboard;
import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;
import org.sticollegeandroidprojects.dictionary.Activity.Activity_Trivia;
import org.sticollegeandroidprojects.dictionary.Activity.Activity_WordList;

public class Fragment_Dashboard extends Fragment {

    private VMDashboard mViewModel;

    private View view;

    private NavController navController;
    private MaterialButton btnP2E, btnE2P;
    private CardView cvTrivia;
    private ImageView imgTrivia;
    private TextView txtWord, txtDesc;

    public static Fragment_Dashboard newInstance() {
        return new Fragment_Dashboard();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(VMDashboard.class);
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        InitializeWidgets();

        btnP2E.setOnClickListener(v -> {
            Intent loIntent = new Intent(requireContext(), Activity_WordList.class);
            loIntent.putExtra("instance", 0);
            startActivity(loIntent);
        });

        btnE2P.setOnClickListener(v -> {
            Intent loIntent = new Intent(requireContext(), Activity_WordList.class);
            loIntent.putExtra("instance", 1);
            startActivity(loIntent);
        });


        mViewModel.GetTrivia().observe(getViewLifecycleOwner(), trivia -> {
            try {
                Picasso.get().load(trivia.getImgLinkx()).placeholder(org.sticollegeandroidprojects.applicationdriver.R.drawable.ic_baseline_image_not_supported)
                        .error(org.sticollegeandroidprojects.applicationdriver.R.drawable.ic_baseline_broken_image).into(imgTrivia);

                txtWord.setText(trivia.getWordName());
                txtDesc.setText(trivia.getInfoxxxx());
                cvTrivia.setOnClickListener(v -> {
                    Intent loIntent = new Intent(requireContext(), Activity_Trivia.class);
                    loIntent.putExtra("sWordIDxx", trivia.getWordIDxx());
                    startActivity(loIntent);
                });
            } catch (Exception e){
                e.printStackTrace();
            }
        });

        return view;
    }

    private void InitializeWidgets(){
        navController = NavHostFragment.findNavController(Fragment_Dashboard.this);
        btnP2E = view.findViewById(R.id.btnSearchP2E);
        btnE2P = view.findViewById(R.id.btnSearchE2P);
        cvTrivia = view.findViewById(R.id.cvTrivia);
        imgTrivia = view.findViewById(R.id.img_trivia);
        txtWord = view.findViewById(R.id.lblTriviaWord);
        txtDesc = view.findViewById(R.id.lblTriviaDesc);
    }
}