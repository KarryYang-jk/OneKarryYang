package com.example.myapplication;

import android.app.Application;

public class GreenDao extends Application {
    private static GreenDao app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public static GreenDao getApp() {
        return app;
    }
}
