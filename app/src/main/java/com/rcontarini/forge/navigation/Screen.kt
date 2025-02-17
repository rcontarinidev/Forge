package com.rcontarini.forge.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("Home")
    data object Routine: Screen("Routine")
    data object AddExercise: Screen("Add Exercise")
}