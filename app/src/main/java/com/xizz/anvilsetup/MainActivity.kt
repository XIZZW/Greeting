package com.xizz.anvilsetup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelProvider
import com.xizz.anvilsetup.ui.theme.AnvilSetupTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: GreetingViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContent {
            AnvilSetupTheme {
                Greeting(viewModel)
            }
        }
    }
}

@Composable
fun Greeting(viewModel: GreetingViewModel) {
    Text(text = "Hello ${viewModel.getName()}!")
}

