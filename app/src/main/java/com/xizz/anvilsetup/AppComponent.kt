package com.xizz.anvilsetup

import com.squareup.anvil.annotations.MergeComponent

@MergeComponent(AppScope::class)
interface AppComponent {
    fun inject(activity: MainActivity)
}
