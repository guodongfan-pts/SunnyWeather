package com.sunnyweather.android.com.sunnyweather.android;

import android.app.Application;
import android.annotation.SuppressLint;
import android.content.Context

class SunnyWeatherApplication: Application() {

    companion object {
        const val TOKEN = "qX3jFZTklG1IFsKk"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
