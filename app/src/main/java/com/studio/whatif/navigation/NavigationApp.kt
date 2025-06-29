package com.studio.whatif.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.studio.whatif.Beranda
import com.studio.whatif.Simulasi
import com.studio.whatif.SplashScreen

@Composable
fun NavigationApp() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavHost(
        navController = navController,
        startDestination = Screen.splash.route
    ) {
        composable(Screen.splash.route) {
            SplashScreen(navController)
        }
        composable(Screen.beranda.route) {
            Beranda(navController)
        }
        composable(
            "simulasi/{habitId}",
            arguments = listOf(navArgument("habitId") { type = NavType.IntType })
        ) { backStackEntry ->
            val habitId = backStackEntry.arguments?.getInt("habitId") ?: 1
            Simulasi(habitId = habitId)
        }
    }
}
