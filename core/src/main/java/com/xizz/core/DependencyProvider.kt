package com.xizz.core

interface DependencyProvider {
    val viewModelFactory: ViewModelFactory
    fun createUserComponent(userId: String)
    fun clearUserComponent()
}