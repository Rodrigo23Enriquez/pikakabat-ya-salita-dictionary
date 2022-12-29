package org.sticollegeandroidprojects.dictionary.ViewModel;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import org.sticollegeandroidprojects.applicationdriver.AppDriver;
import org.sticollegeandroidprojects.applicationdriver.Repository.FactoryPYSD;
import org.sticollegeandroidprojects.applicationdriver.Repository.Recent;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.util.List;

public class VMRecent extends AndroidViewModel {

    private final FactoryPYSD poSys;

    public VMRecent(@NonNull Application application) {
        super(application);
        this.poSys = new AppDriver(application).InitializeObject(AppDriver.Instance.RECENT);
    }

    public LiveData<List<RWord.RecentWord>> GetRecents(){
        return poSys.GetRecents();
    }

}