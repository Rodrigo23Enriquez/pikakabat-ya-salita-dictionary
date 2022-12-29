package org.sticollegeandroidprojects.applicationdriver.Repository;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.util.List;

public interface FactoryPYSD {

    boolean Save(Object args);
    boolean SaveWord(String args);
    boolean Delete(String args);
    LiveData<List<EDictionaryWords>> SearchWordList(String args); //For Dictionary Only
    LiveData<List<EDictionaryWords>> GetWordsList(String args); //For Dictionary Only
    LiveData<List<BWord.Bookmark>> GetBookmarkList(String args); //For Bookmark Only
    LiveData<List<RWord.RecentWord>> GetRecents(); //For Recent Only
    LiveData<EDictionaryWords> GetWordDetail(String args); //For Dictionary Only

    String getMessage();
}
