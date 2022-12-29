package org.sticollegeandroidprojects.applicationdriver.Repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.Etc.Constants;
import org.sticollegeandroidprojects.applicationdriver.database.AppData;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EBookmarkWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.util.List;

public class Bookmark implements FactoryPYSD{
    private static final String TAG = FactoryPYSD.class.getSimpleName();

    private final Context mContext;

    private final BWord poDao;

    private String message;

    public Bookmark(Context context) {
        this.mContext = context;
        this.poDao = AppData.getInstance(mContext).bookmark();
    }

    @Override
    public boolean Save(Object args) {
        message = "No corresponding method is associated with in this object";
        return false;
    }

    @Override
    public boolean SaveWord(String args) {
        message = "No corresponding method is associated with in this object";
        return false;
    }

    @Override
    public boolean Delete(String args) {
        try{
            EBookmarkWord loDetail = poDao.GetBookmark(args);

            if(loDetail == null){
                message = "Word you're trying to remove does not exist.";
                return false;
            }

            poDao.Delete(args);
            Log.d(TAG, "A word from bookmark has been removed!");
            return true;
        } catch (Exception e){
            e.printStackTrace();
            message = e.getMessage();
            return false;
        }
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
        if(args.equalsIgnoreCase("DESC")){
            return poDao.GetRecentlyBookmarked();
        }
        return poDao.GetBookmarkedAlphabetical();
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
        return message;
    }
}
