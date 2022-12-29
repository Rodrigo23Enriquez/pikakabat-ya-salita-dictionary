package org.sticollegeandroidprojects.dictionary.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.dictionary.R;
import org.sticollegeandroidprojects.dictionary.ViewModel.VMWordList;

import java.util.List;


/**
 *  Handles all the searching and listing of words listing in the dictionary
 */
public class ActivityWordList extends AppCompatActivity {

    private VMWordList mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(ActivityWordList.this).get(VMWordList.class);
        setContentView(R.layout.activity_word_list);

        mViewModel.SaveWord("args", new VMWordList.OnSaveWordListener() {
            @Override
            public void OnSave(String args) {
                //Notify UI that the result of background task is success
            }

            @Override
            public void OnFailed(String message) {
                //Notify UI that the result of background task has failed.
            }
        });

        //ASC for list sorted on ascending order, else DESC for descending order.
        mViewModel.GetWordsList("ASC").observe(ActivityWordList.this, new Observer<List<EDictionaryWords>>() {
            @Override
            public void onChanged(List<EDictionaryWords> eDictionaryWords) {
                try{

                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}