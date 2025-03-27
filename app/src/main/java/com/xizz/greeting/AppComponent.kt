package com.xizz.greeting

import com.squareup.anvil.annotations.MergeComponent
import com.xizz.core.di.AppScope
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@MergeComponent(AppScope::class)
interface AppComponent {
    fun inject(activity: MainActivity)
    fun viewModelFactory(): AppViewModelFactory
    fun userComponentFactory(): UserComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance app: MainApplication,
        ): AppComponent
    }
}
