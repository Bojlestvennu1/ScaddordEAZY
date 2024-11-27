package com.example.scaddordeazy

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.scaddordeazy.screens.FirstScreen
import com.example.scaddordeazy.screens.SecondScreen

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "first_screen") {
        composable("first_screen") { FirstScreen(navController) }
        composable("second_screen") { SecondScreen(navController) }
    }
}
