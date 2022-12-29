package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.ERecentWord;

import java.util.List;

@Dao
public interface RWord {

    @Insert
    void Save(ERecentWord args);

    @Update
    void Update(ERecentWord args);

    @Query("SELECT " +
            "a.sWordIDxx, " +
            "b.sWordName " +
            "FROM Recent_Words a " +
            "LEFT JOIN Dictionary_Words b " +
            "ON a.sWordIDxx = b.sWordIDxx " +
            "ORDER BY dTimeStmp DESC")
    LiveData<List<RecentWord>> GetWordList();

    class RecentWord{
        public String WordIDxx;
        public String WordName;
    }
}
