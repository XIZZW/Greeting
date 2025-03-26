package com.xizz.anvilsetup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.xizz.anvilsetup.ui.theme.AnvilSetupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnvilSetupTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting(
    viewModel: GreetingViewModel = viewModel(factory = LocalContext.current.appComponent.viewModelFactory())
) {
    Text(text = "Hello ${viewModel.getName()}!")
}
