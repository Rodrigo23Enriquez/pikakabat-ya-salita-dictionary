package org.sticollegeandroidprojects.applicationdriver.Repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.util.List;

public class Recent implements FactoryPYSD{
    private static final String TAG = FactoryPYSD.class.getSimpleName();

    private final Context mContext;

    private String message;

    public Recent(Context context) {
        this.mContext = context;
    }

    @Override
    public boolean Save(Object args) {
        return false;
    }

    @Override
    public boolean SaveWord(String args) {
        return false;
    }

    @Override
    public boolean Delete(String args) {
        return false;
    }

    @Override
    public LiveData<List<EDictionaryWords>> SearchWordList(String args) {
        return null;
    }

    @Override
    public LiveData<List<EDictionaryWords>> GetWordsList(String args) {
        return null;
    }

    @Override
    public LiveData<List<BWord.Bookmark>> GetBookmarkList(String args) {
        return null;
    }

    @Override
    public LiveData<List<RWord.RecentWord>> GetRecents() {
        return null;
    }

    @Override
    public LiveData<EDictionaryWords> GetWordDetail(String args) {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
