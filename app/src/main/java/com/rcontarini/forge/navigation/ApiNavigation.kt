package com.rcontarini.forge.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rcontarini.forge.ui.screen.ExerciseScreen
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
                modifier = Modifier.fillMaxSize(),
                onBackPressed = {
                    navController.popBackStack()
                },
                addExerciseClicked = {
                    navController.navigate(Screen.AddExercise.route)
                }
            )
        }

        composable(Screen.AddExercise.route) {
            ExerciseScreen(
                modifier = Modifier.fillMaxSize(),
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }
    }
}