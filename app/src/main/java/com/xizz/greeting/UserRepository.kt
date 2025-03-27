package com.xizz.greeting

interface UserRepository {
    fun getUserName(userId: String): String
}
