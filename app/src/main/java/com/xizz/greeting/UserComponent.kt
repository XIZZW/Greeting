package com.xizz.greeting

import com.squareup.anvil.annotations.MergeSubcomponent
import com.xizz.core.di.UserScope
import dagger.BindsInstance
import dagger.Subcomponent

@MergeSubcomponent(UserScope::class)
interface UserComponent {
    fun viewModelFactory(): UserViewModelFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance userId: String): UserComponent
    }
}
