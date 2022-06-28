package com.applecompose.oregonlottery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.applecompose.oregonlottery.presentation.navigation.Navigation
import com.applecompose.oregonlottery.ui.theme.OregonLotteryTheme

class MainActivity : ComponentActivity() {

	lateinit var navController: NavHostController
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			OregonLotteryTheme {

					navController = rememberNavController()
					Navigation(navController)


			}
		}
	}
}



