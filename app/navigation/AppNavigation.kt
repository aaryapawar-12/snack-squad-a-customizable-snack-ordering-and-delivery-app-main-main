package com.snacksquad.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.snacksquad.app.ui.screens.*

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Signup : Screen("signup")
    object Home : Screen("home")
    object Cart : Screen("cart")
}

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Screen.Login.route) {

        composable(Screen.Login.route) {
            LoginScreen(
                onLoginSuccess = { navController.navigate(Screen.Home.route) },
                onSignupClick = { navController.navigate(Screen.Signup.route) }
            )
        }

        composable(Screen.Signup.route) {
            SignupScreen(onSignupSuccess = { navController.navigate(Screen.Login.route) })
        }

        composable(Screen.Home.route) {
            HomeScreen(onCartClick = { navController.navigate(Screen.Cart.route) })
        }

        composable(Screen.Cart.route) {
            CartScreen(onBack = { navController.popBackStack() })
        }
    }
}
