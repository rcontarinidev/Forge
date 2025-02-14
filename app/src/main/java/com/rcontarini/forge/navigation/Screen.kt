package com.rcontarini.forge.navigation

sealed class Screen(val route: String) {
    object Home: Screen("Home")
    object Routine: Screen("Routine")
}