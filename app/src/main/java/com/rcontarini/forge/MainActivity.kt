package com.rcontarini.forge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.rcontarini.forge.navigation.AppNavigation
import com.rcontarini.forge.ui.theme.ForgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ForgeTheme {
                val navController = rememberNavController()
                AppNavigation(navController = navController)
            }
        }
    }
}
