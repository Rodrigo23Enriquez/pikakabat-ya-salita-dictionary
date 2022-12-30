package org.sticollegeandroidprojects.dictionary.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.dictionary.Adapter.AdapterDescriptionInfos;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMWordList;

import java.util.ArrayList;


/**
 *  Handles all the searching and listing of words listing in the dictionary
 */
public class Activity_WordList extends AppCompatActivity {
    private static final String TAG = Activity_WordList.class.getSimpleName();

    private VMWordList mViewModel;

    private int lnType;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private AutoCompleteTextView txtSearch;
    private NestedScrollView ncvDescript;
    private TextView lblWord, lblType, lblPrnc, lblDesc;
    private ImageButton btnSave, btnListen;
    private RecyclerView rcvTranslate, rcvSamples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(Activity_WordList.this).get(VMWordList.class);
        setContentView(R.layout.activity_word_list);
        lnType = getIntent().getIntExtra("instance", 0);
        InitWidgets();
        //ASC for list sorted on ascending order, else DESC for descending order.
        mViewModel.GetWordsList(lnType).observe(Activity_WordList.this, eDictionaryWords -> {
            try{
                ArrayList<String> loList = new ArrayList<>();
                for (int x = 0; x < eDictionaryWords.size(); x++){
                    loList.add(eDictionaryWords.get(x).getWordName());
                }

                ArrayAdapter<String> loAdapter = new ArrayAdapter<>(Activity_WordList.this, android.R.layout.simple_spinner_dropdown_item, loList.toArray(new String[0]));
                txtSearch.setAdapter(loAdapter);

                txtSearch.setOnItemClickListener((parent, view, position, id) -> {
                    String lsSelectd = txtSearch.getText().toString();
                    for(int x = 0; x < eDictionaryWords.size(); x++){
                        if(lsSelectd.equalsIgnoreCase(eDictionaryWords.get(x).getWordName())){
                            lsSelectd = eDictionaryWords.get(x).getWordIDxx();
                        }
                    }

                    mViewModel.SaveRecent(lsSelectd, new VMWordList.OnSaveWordListener() {
                        @Override
                        public void OnSave(String args) {
                            Log.d(TAG, "a new recent has been saved/updated.");
                        }

                        @Override
                        public void OnFailed(String message) {
                            Log.e(TAG, "unable to save new recent search. " + message);
                        }
                    });
                    txtSearch.setText("");
                    txtSearch.clearFocus();
                });
            } catch (Exception e){
                e.printStackTrace();
            }
        });

        mViewModel.GetRecentList(lnType).observe(Activity_WordList.this, recentWords -> {
            try{
                if(recentWords.size() > 0) {
                    if(!getIntent().hasExtra("sWordIDxx")) {
                        PreviewResult(recentWords.get(0).sWordIDxx);
                    } else {
                        String lsWordID = getIntent().getStringExtra("sWordIDxx");
                        PreviewResult(lsWordID);
                    }

                    tabLayout.setVisibility(View.VISIBLE);
                    tabLayout.removeAllTabs();
                    for (int x = 0; x < recentWords.size(); x++) {
                        tabLayout.addTab(tabLayout.newTab().setText(recentWords.get(x).sWordName));
                    }

                    tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                        @Override
                        public void onTabSelected(TabLayout.Tab tab) {
                            mViewModel.setWordID(recentWords.get(tab.getPosition()).sWordIDxx);
                        }

                        @Override
                        public void onTabUnselected(TabLayout.Tab tab) {

                        }

                        @Override
                        public void onTabReselected(TabLayout.Tab tab) {

                        }
                    });
                } else {
                    tabLayout.setVisibility(View.GONE);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        });

        mViewModel.getWordID().observe(Activity_WordList.this, s -> {
            try {
                if (s != null) {
                    PreviewResult(s);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    private void InitWidgets(){
        toolbar = findViewById(R.id.toolbar);
        if (lnType == 0){
            toolbar.setTitle("Pangasinan - English");
        } else {
            toolbar.setTitle("English - Pangasinan");
        }
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout = findViewById(R.id.tablayout);
        txtSearch = findViewById(R.id.txtSearch);
        ncvDescript = findViewById(R.id.ncvDescription);

        lblWord = findViewById(R.id.lblWord);
        lblType = findViewById(R.id.lblWordType);
        lblPrnc = findViewById(R.id.lblPrnction);
        lblDesc = findViewById(R.id.lblWordDesc);
        btnSave = findViewById(R.id.btnBookMark);
        btnListen = findViewById(R.id.btnSpeech);
        rcvTranslate = findViewById(R.id.rcv_translate);
        rcvSamples = findViewById(R.id.rcv_samples);
    }

    private void PreviewResult(String args){
        mViewModel.GetWordDetail(args).observe(Activity_WordList.this, word -> {
            try{
                mViewModel.GetBookmarkWord(word.getWordIDxx()).observe(Activity_WordList.this, bookmark -> {
                    if(bookmark == null){
                        btnSave.setImageDrawable(getResources().getDrawable(org.sticollegeandroidprojects.applicationdriver.R.drawable.ic_baseline_bookmark));
                    } else {
                        btnSave.setImageDrawable(getResources().getDrawable(org.sticollegeandroidprojects.applicationdriver.R.drawable.ic_baseline_bookmark_filled));
                    }
                });
                lblWord.setText(word.getWordName());
                lblType.setText(word.getWordType());
                lblPrnc.setText(word.getPrnction());
                lblDesc.setText(word.getDescript());
                String[] lsTranslate = word.getTransLte().split(", ");
                String[] lsExamples = word.getInfoxxxx().split(", ");

                LinearLayoutManager loLayout = new LinearLayoutManager(Activity_WordList.this);
                loLayout.setOrientation(RecyclerView.VERTICAL);
                rcvTranslate.setLayoutManager(loLayout);
                rcvTranslate.setAdapter(new AdapterDescriptionInfos(lsTranslate));

                loLayout = new LinearLayoutManager(Activity_WordList.this);
                loLayout.setOrientation(RecyclerView.VERTICAL);
                rcvSamples.setLayoutManager(loLayout);
                rcvSamples.setAdapter(new AdapterDescriptionInfos(lsExamples));

                btnSave.setOnClickListener(v -> mViewModel.SaveWord(word.getWordIDxx(), new VMWordList.OnSaveWordListener() {
                    @Override
                    public void OnSave(String args1) {
                        Toast.makeText(Activity_WordList.this, word.getWordName() + " added to favorites.", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void OnFailed(String message) {
                        Toast.makeText(Activity_WordList.this, message, Toast.LENGTH_SHORT).show();
                    }
                }));
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}