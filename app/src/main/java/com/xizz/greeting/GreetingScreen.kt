package com.xizz.greeting

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import java.util.UUID

@Composable
fun GreetingScreen(
    navController: NavHostController,
    viewModel: GreetingViewModel = viewModel(factory = LocalContext.current.appComponent.viewModelFactory()),
) {
    Column {
        Text(text = "Hello ${viewModel.getName()}!")
        Button(onClick = { navController.navigate("user/${UUID.randomUUID()}") }) {
            Text(text = "Go to User Screen")
        }
    }
}
