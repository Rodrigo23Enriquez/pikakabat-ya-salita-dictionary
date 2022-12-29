package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EBookmarkWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EDictionaryWords;

import java.util.List;

@Dao
public interface DWord {

    @Insert
    void Save(EDictionaryWords args);

    @Insert
    void Save(EBookmarkWord args);

    @Query("SELECT * FROM Bookmarked_Words WHERE sWordIDxx=:args")
    EBookmarkWord GetBookmark(String args);

    @Query("SELECT * FROM Dictionary_Words WHERE sWordName=:args")
    EDictionaryWords GetDictionaryWord(String args);

    @Update
    void Update(EDictionaryWords args);

    @Query("SELECT COUNT(*) FROM Dictionary_Words")
    int GetRowsCountForID();

    @Query("SELECT * FROM Dictionary_Words WHERE sWordIDxx=:args")
    LiveData<EDictionaryWords> GetWordDetail(String args);

    @Query("SELECT * FROM Dictionary_Words")
    LiveData<List<EDictionaryWords>> GetWordList();

    @Query("SELECT * FROM Dictionary_Words ORDER BY sWordName ASC")
    LiveData<List<EDictionaryWords>> GetWordListSortAscending();

    @Query("SELECT * FROM Dictionary_Words ORDER BY sWordName DESC")
    LiveData<List<EDictionaryWords>> GetWordListSortDescending();

    @Query("SELECT * FROM Dictionary_Words WHERE sWordName LIKE '%' || :args || '%'")
    LiveData<List<EDictionaryWords>> GetWordList(String args);
}
