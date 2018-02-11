package com.example.root.barcodepractice;

import android.app.Application;

import com.example.root.barcodepractice.models.DaoMaster;
import com.example.root.barcodepractice.models.DaoSession;

/**
 * Created by root on 2/12/18.
 */

public class App extends Application {

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mDaoSession = new DaoMaster(
                new DaoMaster.DevOpenHelper(this, "my.db").getWritableDb()).newSession();
    }

    public DaoSession getmDaoSession() {
        return mDaoSession;
    }
}
