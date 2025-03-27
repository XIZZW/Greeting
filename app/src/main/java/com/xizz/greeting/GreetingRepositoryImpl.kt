package com.xizz.greeting

import com.squareup.anvil.annotations.ContributesBinding
import com.xizz.core.di.AppScope
import javax.inject.Inject

@ContributesBinding(AppScope::class)
class GreetingRepositoryImpl @Inject constructor() : GreetingRepository {
    override fun getGreeting() = "Hello Anvil!"
}
