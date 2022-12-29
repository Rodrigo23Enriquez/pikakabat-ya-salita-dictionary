package org.sticollegeandroidprojects.applicationdriver.Repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;

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
    public LiveData<List<EDictionaryWords>> GetWordsList(String args) {
        return null;
    }

    @Override
    public Object GetDetail(String args) {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
