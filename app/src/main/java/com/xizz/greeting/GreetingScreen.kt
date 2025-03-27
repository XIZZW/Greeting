package com.xizz.greeting

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.xizz.greeting.ui.theme.AnvilSetupTheme

@Composable
fun GreetingScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    viewModel: GreetingViewModel = viewModel(factory = LocalContext.current.appComponent.viewModelFactory()),
) {
    Greeting(
        modifier = modifier,
        greeting = viewModel.getGreeting(),
        onClick = {
            val userId = viewModel.createUserSession()
            navController.navigate("user/${userId}")
        })
}

@Composable
private fun Greeting(
    modifier: Modifier = Modifier,
    greeting: String,
    onClick: () -> Unit,
) {
    Column(modifier = modifier) {
        Text(text = greeting)
        Button(
            onClick = onClick,
        ) {
            Text(text = "Go to User Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    AnvilSetupTheme {
        Greeting(
            modifier = Modifier,
            greeting = "Hello Android!",
            onClick = {},
        )
    }
}
