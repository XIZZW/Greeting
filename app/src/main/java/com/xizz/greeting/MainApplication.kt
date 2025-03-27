package com.xizz.greeting

import android.app.Application
import android.content.Context
import javax.inject.Inject


class MainApplication @Inject constructor(): Application() {
    val appComponent: AppComponent by lazy { DaggerAppComponent.create() }


    var userComponent: UserComponent? = null

    fun createUserComponent(userId: String) {
        userComponent = appComponent.userComponentFactory().create(userId)
    }

    fun clearUserComponent() {
        userComponent = null
    }
}

val Context.appComponent: AppComponent get() = (applicationContext as MainApplication).appComponent
