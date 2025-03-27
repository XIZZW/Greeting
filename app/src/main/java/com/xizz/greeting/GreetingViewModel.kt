package com.xizz.greeting

import androidx.lifecycle.ViewModel
import com.squareup.anvil.annotations.ContributesMultibinding
import com.xizz.core.AppScope
import com.xizz.core.DependencyProvider
import com.xizz.core.ViewModelKey
import com.xizz.pub.GreetingRepository
import java.util.UUID
import javax.inject.Inject

@ContributesMultibinding(AppScope::class, boundType = ViewModel::class)
@ViewModelKey(GreetingViewModel::class)
class GreetingViewModel @Inject constructor(
    private val dependencyProvider: DependencyProvider,
    private val greetingRepository: GreetingRepository
) : ViewModel() {
    fun getGreeting() = greetingRepository.getGreeting()

    fun createUserSession(): String {
        val userId = UUID.randomUUID().toString()
        dependencyProvider.createUserComponent(userId)
        return userId
    }
}
