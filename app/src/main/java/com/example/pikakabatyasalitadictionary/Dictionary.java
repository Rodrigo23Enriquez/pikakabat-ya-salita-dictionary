package com.example.pikakabatyasalitadictionary;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Dictionary extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView btMenu;
    RecyclerView recyclerView;
    ListView pangtoenglistview;
    ListAdapter pangtoengadapter;
    String[] pangtoengwordslistview;
    ArrayList<PangToEngModel> pangtoengarraylist = new ArrayList<PangToEngModel>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        drawerLayout = findViewById(R.id.drawer_layout);
        btMenu = findViewById(R.id.btmenu);
        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MainAdapter(this,MainActivity.arrayList));

        btMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });



        pangtoenglistview = findViewById(R.id.pangtoeng);

        pangtoengwordslistview = new String[]{"Aalaen", "Aaralen", "Abong-aralan", "Bangon", "Dalanan", "Dayo", "Dengel", "Derew", "Diman", "Duara",
                                            "Dukduk", "Dumaralos", "Ebat", "Ekalen", "Erep", "Galaw", "Garita", "Gastador", "Gawat", "Hueteng",
                                            "Ibaan", "Ibales", "Ibangat", "Ibulos", "Idamay", "Iinomen", "Ikutkut", "Ilako", "Ilugan", "Inagem",
                                            "Inalig", "Inatey", "Inawa", "Inbaga", "Iner", "Ipakerew", "Ipaotang", "Ituro", "Kaagewan", "Labayen",
                                            "Labi", "Mangiras", "Manisia", "Naksawan", "Samar", "Tampol", "Tilak", "Uliten", "Ubakan", "Yatol"};

        for (int i=0; i <pangtoengwordslistview.length; i++){
            PangToEngModel pangToEngModel = new PangToEngModel(pangtoengwordslistview[i]);
            pangtoengarraylist.add(pangToEngModel);
        }

        pangtoengadapter = new PangtoEngListViewAdapter(this, pangtoengarraylist);

        pangtoenglistview.setAdapter(pangtoengadapter);
    }


    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout) ;
    }

}

