package org.sticollegeandroidprojects.dictionary.ViewModel;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.sticollegeandroidprojects.applicationdriver.AppDriver;
import org.sticollegeandroidprojects.applicationdriver.Repository.FactoryPYSD;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;

import java.util.List;

public class VMWordList extends AndroidViewModel {

    private final FactoryPYSD poSys;

    public interface OnSaveWordListener{
        void OnSave(String args);
        void OnFailed(String message);
    }

    public VMWordList(@NonNull Application application) {
        super(application);
        this.poSys = new AppDriver(application).InitializeObject(AppDriver.Instance.DICTIONARY);
    }

    public LiveData<List<EDictionaryWords>> SearchWordList(String args){
        return poSys.SearchWordList(args);
    }

    //retrieval of data
    public LiveData<List<EDictionaryWords>> GetWordsList(String args){
        return poSys.GetWordsList(args);
    }

    //Insert, Update, Delete
    //manipulation of data
    public void SaveWord(String args, OnSaveWordListener listener){
        new SaveWordTask(listener).execute(args);
    }

    private class SaveWordTask extends AsyncTask<String, Void, Boolean>{

        private final OnSaveWordListener listener;

        private String message;

        public SaveWordTask(OnSaveWordListener listener) {
            this.listener = listener;
        }

        @Override
        protected Boolean doInBackground(String... strings) {
            //Background task
            try{
                if(poSys.SaveWord("sample")){
                    return true;
                } else {
                    message = poSys.getMessage();
                    return false;
                }
            } catch (Exception e){
                e.printStackTrace();
                message = e.getMessage();
                return false;
            }
        }

        @Override
        protected void onPostExecute(Boolean isSuccess) {
            //Foreground task or process to notify UI that a certain
            // background task has finished and has result
            super.onPostExecute(isSuccess);
            if(isSuccess){
                listener.OnSave("args");
            } else {
                listener.OnFailed(message);
            }
        }
    }
}
