package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;

import java.util.List;

@Dao
public interface DWord {

    @Insert
    void Save(EDictionaryWords args);

    @Update
    void Update(EDictionaryWords args);

    @Query("SELECT * FROM Dictionary_Words")
    LiveData<List<EDictionaryWords>> GetWordList();

    @Query("SELECT * FROM Dictionary_Words WHERE sWordName LIKE '%' || :args || '%'")
    LiveData<List<EDictionaryWords>> GetWordList(String args);
}
