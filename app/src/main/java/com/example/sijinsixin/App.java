package com.example.sijinsixin;

import android.app.Application;
import android.content.Context;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class App extends Application {

    private static Context mContext;

    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
