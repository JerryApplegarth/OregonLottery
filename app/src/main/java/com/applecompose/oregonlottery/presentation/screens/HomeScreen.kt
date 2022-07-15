package com.applecompose.oregonlottery.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.applecompose.oregonlottery.R
import com.applecompose.oregonlottery.presentation.components.MyTopAppBar
import com.applecompose.oregonlottery.presentation.navigation.screen.Screen
import com.applecompose.oregonlottery.ui.theme.fontColor
import com.applecompose.oregonlottery.ui.theme.newBackgroundColor

@Composable
fun HomeScreen(navController: NavController) {
	Scaffold() {

		Column(
			modifier = Modifier
				.fillMaxSize()
				.background(MaterialTheme.colors.fontColor),

			verticalArrangement = Arrangement.Top,
			horizontalAlignment = Alignment.CenterHorizontally

		) {
			MyTopAppBar( )
			Spacer(modifier = Modifier.height(200.dp))
			Text(
				modifier = Modifier
					.padding(start = 8.dp),
				text = stringResource(R.string.janice),
				fontSize = 36.sp,
				fontWeight = FontWeight.ExtraBold,
				fontFamily = FontFamily.Cursive,

			)
			Spacer(modifier = Modifier.height(16.dp))

			Text(
				modifier = Modifier
					.padding(start = 8.dp),
				text = stringResource(R.string.welcome_to_oregon),
				fontSize = 20.sp,
				fontWeight = FontWeight.Bold,
				color = MaterialTheme.colors.onPrimary
			)
			Spacer(modifier = Modifier.height(36.dp))
			Text(
				modifier = Modifier
					.padding(start = 8.dp)
					.clickable {
						navController.navigate(route = Screen.PrintNumbers.route)
					},

				text = stringResource(id = R.string.click),
				fontSize = 16.sp,
				fontWeight = FontWeight.Bold
			)
		}
	}

}
