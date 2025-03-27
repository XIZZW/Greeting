package com.xizz.greeting

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

@ContributesBinding(UserScope::class)
class UserRepositoryImpl @Inject constructor() : UserRepository {
    override fun getUserName(userId: String): String {
        return userId.split('-').firstOrNull() ?: "Unknown"
    }
}
