package org.sticollegeandroidprojects.applicationdriver;

import android.content.Context;

public class AppDriver {
    private static final String TAG = AppDriver.class.getSimpleName();

    private final Context mContext;

    public AppDriver(Context mContext) {
        this.mContext = mContext;
    }

    public enum Instance{
        DICTIONARY,
        RECENT,
        BOOKMARK
    }


}
