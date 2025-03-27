package com.xizz.greeting

import android.app.Application
import android.content.Context

class MainApplication : Application() {
    val appComponent: AppComponent by lazy { DaggerAppComponent.create() }
}

val Context.appComponent: AppComponent get() = (applicationContext as MainApplication).appComponent
