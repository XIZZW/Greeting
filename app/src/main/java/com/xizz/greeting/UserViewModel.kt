package com.xizz.greeting

import androidx.lifecycle.ViewModel
import com.squareup.anvil.annotations.ContributesMultibinding
import com.xizz.core.UserScope
import javax.inject.Inject

@ContributesMultibinding(UserScope::class, boundType = ViewModel::class)
@ViewModelKey(UserViewModel::class)
class UserViewModel @Inject constructor(
    private val application: MainApplication,
    private val userRepository: UserRepository
) : ViewModel() {
    fun getUserName(userId: String) = userRepository.getUserName(userId)
}
