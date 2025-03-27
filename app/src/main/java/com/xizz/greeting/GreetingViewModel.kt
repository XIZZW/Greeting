package com.xizz.greeting

import androidx.lifecycle.ViewModel
import com.squareup.anvil.annotations.ContributesMultibinding
import com.xizz.core.AppScope
import com.xizz.pub.GreetingRepository
import java.util.UUID
import javax.inject.Inject

@ContributesMultibinding(AppScope::class, boundType = ViewModel::class)
@ViewModelKey(GreetingViewModel::class)
class GreetingViewModel @Inject constructor(
    private val application: MainApplication,
    private val greetingRepository: GreetingRepository
) : ViewModel() {
    fun getGreeting() = greetingRepository.getGreeting()

    fun createUserSession(): String {
        val userId = UUID.randomUUID().toString()
        application.createUserComponent(userId)
        return userId
    }
}
