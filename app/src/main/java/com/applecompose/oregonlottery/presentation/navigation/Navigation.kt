package com.applecompose.oregonlottery.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.PopUpToBuilder


import androidx.navigation.compose.rememberNavController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.applecompose.oregonlottery.presentation.navigation.screen.Screen
import com.applecompose.oregonlottery.presentation.screens.PrintNumbers
import com.applecompose.oregonlottery.presentation.screens.HomeScreen

@Composable
fun Navigation(navController: NavHostController) {



	val navController = rememberNavController()
	NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {


		composable(
			route = Screen.HomeScreen.route
		) {
			HomeScreen(navController = navController)
		}
		composable(
			route = Screen.PrintNumbers.route
		) {
			PrintNumbers(navController = navController)




		}

	}
}