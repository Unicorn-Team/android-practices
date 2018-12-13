package com.example.yueh.androidpractice;

import android.app.Application;
import android.content.Context;

/**
 * Created by yueh on 2018/9/5.
 */

public class DemoApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getInstance() {
        return mContext;
    }
}
