package com.xizz.greeting

import com.squareup.anvil.annotations.MergeComponent

@MergeComponent(AppScope::class)
interface AppComponent {
    fun inject(activity: MainActivity)
    fun viewModelFactory(): ViewModelFactory
    fun userComponentFactory(): UserComponent.Factory
}
