package com.xizz.greeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.xizz.greeting.ui.theme.AnvilSetupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnvilSetupTheme {
                AppNavHost()
            }
        }
    }
}
