package com.example.pikakabatyasalitadictionary.ViewModel;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.sticollegeandroidprojects.applicationdriver.AppDriver;
import org.sticollegeandroidprojects.applicationdriver.Etc.Dialog.InitializeData;
import org.sticollegeandroidprojects.applicationdriver.Repository.FactoryPYSD;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;

import java.util.ArrayList;
import java.util.List;

public class VMSplashScreen extends AndroidViewModel {
    private static final String TAG = VMSplashScreen.class.getSimpleName();

    private final FactoryPYSD poSys;

    public VMSplashScreen(@NonNull Application application) {
        super(application);
        this.poSys = new AppDriver(application).InitializeObject(AppDriver.Instance.DICTIONARY);
        new SaveDataTask().execute();
    }

    private class SaveDataTask extends AsyncTask<String, Void, Boolean>{

        @Override
        protected Boolean doInBackground(String... strings) {
            InitializeData loData = new InitializeData();
            loData.InitializeWords();
            List<EDictionaryWords> loList = loData.GetWordsList();
            for(int x = 0; x < loList.size(); x++){
                EDictionaryWords loDetail = loList.get(x);
                poSys.Save(loDetail);
            }
            return null;
        }
    }
}
