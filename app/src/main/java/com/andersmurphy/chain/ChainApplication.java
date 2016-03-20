package com.andersmurphy.chain;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class ChainApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
