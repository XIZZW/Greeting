package com.xizz.greeting

import com.squareup.anvil.annotations.ContributesBinding
import com.xizz.core.AppScope
import com.xizz.pub.GreetingRepository
import javax.inject.Inject

@ContributesBinding(AppScope::class)
class GreetingRepositoryImpl @Inject constructor() : GreetingRepository {
    override fun getGreeting() = "Hello Anvil!"
}
