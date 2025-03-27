package com.xizz.pub

interface UserRepository {
    fun getUserName(userId: String): String
}