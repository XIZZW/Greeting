package com.xizz.greeting

import com.squareup.anvil.annotations.ContributesSubcomponent
import dagger.BindsInstance

@ContributesSubcomponent(parentScope = AppScope::class, scope = UserScope::class)
interface UserComponent {

    @ContributesSubcomponent.Factory
    interface Factory {
        fun create(@BindsInstance userId: String): UserComponent
    }
}
