package com.example.ava.firstapp;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class IranSans extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/sansnum.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

    }
}
