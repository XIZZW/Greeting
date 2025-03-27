package com.xizz.greeting

import android.app.Application
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
