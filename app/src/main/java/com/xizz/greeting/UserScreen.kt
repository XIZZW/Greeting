package com.xizz.greeting

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun UserScreen(
    userId: String,
    viewModel: UserViewModel = viewModel(factory = LocalContext.current.viewModelFactory),
) {
    Text(text = "Your User ID is $userId and Your Name is ${viewModel.getUserName(userId)}!")
//    Text(text = "Your User ID is $userId!")
}

