package org.sticollegeandroidprojects.applicationdriver.Repository;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;

import java.util.List;

public interface FactoryPYSD {

    boolean Save(Object args);
    LiveData<List<EDictionaryWords>> GetWordsList(String args);
    Object GetDetail(String args);

    String getMessage();
}
