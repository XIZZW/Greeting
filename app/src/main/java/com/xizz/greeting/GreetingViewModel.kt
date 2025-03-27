package com.xizz.greeting

import androidx.lifecycle.ViewModel
import com.squareup.anvil.annotations.ContributesMultibinding
import java.util.UUID
import javax.inject.Inject

@ContributesMultibinding(AppScope::class, boundType = ViewModel::class)
@ViewModelKey(GreetingViewModel::class)
class GreetingViewModel @Inject constructor(
    private val application: MainApplication,
    private val greetingRepository: GreetingRepository
) : ViewModel() {
    fun getName() = greetingRepository.getName()

    fun createUserSession(): String {
        val userId = UUID.randomUUID().toString()
        application.createUserComponent(userId)
        return userId
    }
}
