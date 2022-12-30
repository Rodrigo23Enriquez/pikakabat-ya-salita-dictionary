package com.example.pikakabatyasalitadictionary.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.example.pikakabatyasalitadictionary.R;
import com.example.pikakabatyasalitadictionary.ViewModel.VMSplashScreen;

public class Activity_SplashScreen extends AppCompatActivity {

    private VMSplashScreen mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mViewModel = new ViewModelProvider(Activity_SplashScreen.this).get(VMSplashScreen.class);
        setContentView(R.layout.activity_splash_screen);

        startActivity(new Intent(Activity_SplashScreen.this, Activity_Home.class));
        finish();
    }
}