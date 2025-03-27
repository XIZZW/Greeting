package com.xizz.greeting

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.xizz.core.theme.GreetingTheme
import com.xizz.core.viewModelFactory


@Composable
fun UserScreen(
    modifier: Modifier = Modifier,
    userId: String,
    viewModel: UserViewModel = viewModel(factory = LocalContext.current.viewModelFactory),
) {
    User(
        modifier = modifier,
        userId = userId,
        userName = viewModel.getUserName(userId),
    )
}

@Composable
private fun User(
    modifier: Modifier = Modifier,
    userId: String,
    userName: String,
) {
    Text(
        modifier = modifier,
        text = "Your User ID is $userId and Your Name is $userName!",
    )
}

@Preview(showBackground = true)
@Composable
private fun UserPreview() {
    GreetingTheme {
        User(
            modifier = Modifier,
            userId = "123456",
            userName = "Tommy Lee",
        )
    }
}
