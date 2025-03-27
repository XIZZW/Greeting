package com.xizz.user

import androidx.lifecycle.ViewModel
import com.squareup.anvil.annotations.ContributesMultibinding
import com.xizz.core.DependencyProvider
import com.xizz.core.UserScope
import com.xizz.core.ViewModelKey
import com.xizz.pub.UserRepository
import javax.inject.Inject

@ContributesMultibinding(UserScope::class, boundType = ViewModel::class)
@ViewModelKey(UserViewModel::class)
class UserViewModel @Inject constructor(
    private val dependencyProvider: DependencyProvider,
    private val userRepository: UserRepository
) : ViewModel() {
    fun getUserName(userId: String) = userRepository.getUserName(userId)
}
