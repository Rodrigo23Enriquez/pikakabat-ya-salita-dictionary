package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EBookmarkWord;

import java.util.List;

@Dao
public interface BWord {

    @Insert
    void Save(EBookmarkWord args);

    @Update
    void Update(EBookmarkWord args);

    @Query("SELECT * FROM Bookmarked_Words")
    LiveData<List<EBookmarkWord>> GetBookmarks();
}
