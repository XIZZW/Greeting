package com.xizz.anvilsetup

import android.app.Application

class MainApplication : Application() {
    val appComponent: AppComponent by lazy { DaggerAppComponent.create() }
}
