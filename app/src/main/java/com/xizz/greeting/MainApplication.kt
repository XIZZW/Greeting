package com.xizz.greeting

import android.app.Application
import android.content.Context
import com.xizz.core.DependencyProvider
import com.xizz.core.ViewModelFactory


class MainApplication() : Application(), DependencyProvider {
    val appComponent: AppComponent by lazy { DaggerAppComponent.factory().create(this) }
    var userComponent: UserComponent? = null

    override val viewModelFactory: ViewModelFactory
        get() = userComponent?.viewModelFactory() ?: appComponent.viewModelFactory()

    override fun createUserComponent(userId: String) {
        userComponent = appComponent.userComponentFactory().create(userId)
    }

    override fun clearUserComponent() {
        userComponent = null
    }
}

val Context.appComponent: AppComponent
    get() = (applicationContext as MainApplication).appComponent
val Context.userComponent: UserComponent?
    get() = (applicationContext as MainApplication).userComponent
val Context.viewModelFactory: ViewModelFactory
    get() = userComponent?.viewModelFactory() ?: appComponent.viewModelFactory()
