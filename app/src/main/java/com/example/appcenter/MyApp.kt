package com.example.appcenter

import android.app.Application
import com.example.appcenter.Constants.appCenterSecretKey
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AppCenter.start(
            this,
            appCenterSecretKey,
            Analytics::class.java,
            Crashes::class.java
        )
    }
}