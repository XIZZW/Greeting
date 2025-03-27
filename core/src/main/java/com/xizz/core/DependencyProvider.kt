package com.xizz.core

import android.content.Context

interface DependencyProvider {
    val viewModelFactory: ViewModelFactory
    fun createUserComponent(userId: String)
    fun clearUserComponent()
}

val Context.viewModelFactory: ViewModelFactory
    get() = (applicationContext as DependencyProvider).viewModelFactory
