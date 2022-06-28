package com.applecompose.oregonlottery.presentation.navigation.screen

sealed class Screen(val route: String) {

	object HomeScreen: Screen("home_screen")



	object PrintNumbers : Screen("print_numbers")
}