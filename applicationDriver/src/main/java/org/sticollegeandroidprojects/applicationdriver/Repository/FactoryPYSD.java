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
    LiveData<List<EDictionaryWords>> SearchWordList(String args);
    LiveData<List<EDictionaryWords>> GetWordsList(String args);
    LiveData<List<BWord.Bookmark>> GetBookmarkList(String args);
    LiveData<List<RWord.RecentWord>> GetRecents();
    LiveData<EDictionaryWords> GetWordDetail(String args);

    String getMessage();
}
