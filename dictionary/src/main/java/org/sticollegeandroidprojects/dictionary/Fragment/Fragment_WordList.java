package org.sticollegeandroidprojects.dictionary.Fragment;

import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import org.json.JSONArray;
import org.json.JSONObject;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;
import org.sticollegeandroidprojects.dictionary.Adapter.AdapterDescriptionInfos;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMWordList;

import java.util.ArrayList;
import java.util.List;

public class Fragment_WordList extends Fragment {
    private static final String TAG = Fragment_WordList.class.getSimpleName();

    private VMWordList mViewModel;

    private View view;
    private TabLayout tabLayout;
    private AutoCompleteTextView txtSearch;
    private RecyclerView recyclerView;
    private NestedScrollView ncvDescript;
    private TextView lblWord, lblType, lblPrnc, lblDesc;
    private ImageButton btnSave, btnListen;
    private RecyclerView rcvTranslate, rcvSamples;

    public static Fragment_WordList newInstance() {
        return new Fragment_WordList();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(requireActivity()).get(VMWordList.class);
        view = inflater.inflate(R.layout.fragment_word_list, container, false);

        InitWidgets();
        int lnType = getArguments().getInt("instance");
        //parameter has been set to empty string in order to retrieve all values from database.
        //words retrieve will be use for searching using autocomplete textview.
        mViewModel.GetWordsList(lnType).observe(requireActivity(), eDictionaryWords -> {
            try{
                ArrayList<String> loList = new ArrayList<>();
                for (int x = 0; x < eDictionaryWords.size(); x++){
                    loList.add(eDictionaryWords.get(x).getWordName());
                }

                ArrayAdapter<String> loAdapter = new ArrayAdapter<>(requireActivity(), android.R.layout.simple_spinner_dropdown_item, loList.toArray(new String[0]));
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

        mViewModel.GetRecentList(lnType).observe(requireActivity(), recentWords -> {
            try{
                tabLayout.removeAllTabs();
                for(int x = 0; x < recentWords.size(); x++){
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
            } catch (Exception e){
                e.printStackTrace();
            }
        });

        mViewModel.getWordID().observe(getViewLifecycleOwner(), s -> {
            try {
                if (s != null) {
                    PreviewResult(s);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        });

        return view;
    }

    private void InitWidgets(){
        tabLayout = view.findViewById(R.id.tablayout);
        txtSearch = view.findViewById(R.id.txtSearch);
        recyclerView = view.findViewById(R.id.recyclerview);
        ncvDescript = view.findViewById(R.id.ncvDescription);

        lblWord = view.findViewById(R.id.lblWord);
        lblType = view.findViewById(R.id.lblWordType);
        lblPrnc = view.findViewById(R.id.lblPrnction);
        lblDesc = view.findViewById(R.id.lblWordDesc);
        btnSave = view.findViewById(R.id.btnBookMark);
        btnListen = view.findViewById(R.id.btnSpeech);
        rcvTranslate = view.findViewById(R.id.rcv_translate);
        rcvSamples = view.findViewById(R.id.rcv_samples);
    }

    private void PreviewResult(String args){
        mViewModel.GetWordDetail(args).observe(getViewLifecycleOwner(), word -> {
            try{
                lblWord.setText(word.getWordName());
                lblType.setText(word.getWordType());
                lblPrnc.setText(word.getPrnction());
                lblDesc.setText(word.getDescript());
                String[] lsTranslate = word.getTransLte().split(", ");
                String[] lsExamples = word.getInfoxxxx().split(", ");

                LinearLayoutManager loLayout = new LinearLayoutManager(requireActivity());
                loLayout.setOrientation(RecyclerView.VERTICAL);
                rcvTranslate.setLayoutManager(loLayout);
                rcvTranslate.setAdapter(new AdapterDescriptionInfos(lsTranslate));

                loLayout = new LinearLayoutManager(requireActivity());
                loLayout.setOrientation(RecyclerView.VERTICAL);
                rcvSamples.setLayoutManager(loLayout);
                rcvSamples.setAdapter(new AdapterDescriptionInfos(lsExamples));
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}