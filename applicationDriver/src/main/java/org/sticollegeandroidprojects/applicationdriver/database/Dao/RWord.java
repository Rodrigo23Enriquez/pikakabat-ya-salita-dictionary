package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.ERecentWord;

import java.util.List;

@Dao
public interface RWord {

    @Insert
    void Save(ERecentWord args);

    @Update
    void Update(ERecentWord args);

    @Query("SELECT * FROM Recent_Words")
    LiveData<List<ERecentWord>> GetWordList();
}
