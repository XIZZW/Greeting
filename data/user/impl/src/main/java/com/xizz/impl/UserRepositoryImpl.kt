package com.xizz.impl

import com.squareup.anvil.annotations.ContributesBinding
import com.xizz.core.UserScope
import com.xizz.pub.UserRepository
import javax.inject.Inject

@ContributesBinding(UserScope::class)
class UserRepositoryImpl @Inject constructor() : UserRepository {
    override fun getUserName(userId: String): String {
        return userId.split('-').firstOrNull() ?: "Unknown"
    }
}
