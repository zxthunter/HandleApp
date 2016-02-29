package com.hunter.handleapp;

import com.activeandroid.ActiveAndroid;

/**
 * Created by zxt on 2016/2/25.
 */
public class mApplication extends com.activeandroid.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
