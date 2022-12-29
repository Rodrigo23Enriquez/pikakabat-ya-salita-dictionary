package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.Entity.EBookmarkWord;

import java.util.List;

@Dao
public interface BWord {

    @Insert
    void Save(EBookmarkWord args);

    @Update
    void Update(EBookmarkWord args);

    @Query("DELETE FROM Bookmarked_Words WHERE sWordIDxx=:args")
    void Delete(String args);

    @Query("SELECT * FROM Bookmarked_Words WHERE sWordIDxx=:args")
    EBookmarkWord GetBookmark(String args);

    @Query("SELECT " +
            "a.sWordIDxx, " +
            "b.sWordName " +
            "FROM Bookmarked_Words a " +
            "LEFT JOIN Dictionary_Words b " +
            "ON a.sWordIDxx = b.sWordIDxx " +
            "ORDER BY a.dTimeStmp DESC")
    LiveData<List<Bookmark>> GetRecentlyBookmarked();

    @Query("SELECT " +
            "a.sWordIDxx, " +
            "b.sWordName " +
            "FROM Bookmarked_Words a " +
            "LEFT JOIN Dictionary_Words b " +
            "ON a.sWordIDxx = b.sWordIDxx " +
            "ORDER BY b.sWordName ASC")
    LiveData<List<Bookmark>> GetBookmarkedAlphabetical();

    class Bookmark{
        public String WordIDxx;
        public String WordName;
    }
}
