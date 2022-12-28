package com.example.pikakabatyasalitadictionary;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PangtoEnglishDiscription extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pangto_english_discription);



        TextView pangtoengDiscription = findViewById(R.id.pangtoengdiscription);

        Intent pangtoengIntent = getIntent();
        String pangtoengActionBarTitle = pangtoengIntent.getStringExtra("pangtoengactionBarTitle");
        String pangtoengContent = pangtoengIntent.getStringExtra("pangtoengContent");

        pangtoengDiscription.setText(pangtoengContent);
    }
}