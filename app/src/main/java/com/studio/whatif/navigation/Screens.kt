package com.studio.whatif.navigation

sealed class Screen(val route:String){
    data object splash : Screen("splashscreen")
    data object beranda : Screen("homepage")
    data object simulasi : Screen("simulationpage/{habitId}") {
        fun createRoute(habitId: Int) = "simulationpage/$habitId"
    }
}