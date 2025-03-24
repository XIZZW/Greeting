package com.xizz.anvilsetup

import androidx.lifecycle.ViewModel
import com.squareup.anvil.annotations.ContributesMultibinding
import javax.inject.Inject

@ContributesMultibinding(AppScope::class, boundType = ViewModel::class)
@ViewModelKey(GreetingViewModel::class)
class GreetingViewModel @Inject constructor(
    private val greetingRepository: GreetingRepository
) : ViewModel() {
    fun getName() = greetingRepository.getName()
}
