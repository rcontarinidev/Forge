package com.rcontarini.forge.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rcontarini.forge.ui.screen.HomeScreen
import com.rcontarini.forge.ui.screen.RoutineScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(
                listRoutine = listOf(),
                onRoutineClicked = {
                    navController.navigate(Screen.Routine.route)
                }
            )
        }

        composable(Screen.Routine.route) {
            RoutineScreen(
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }
    }
}