package com.applecompose.oregonlottery.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyTopAppBar(

) {
	Row(
		modifier = Modifier
			.background(MaterialTheme.colors.onSecondary)
			.fillMaxWidth()
			.height(36.dp)
			.padding(8.dp)
	) {
		Text(
			text = "Oregon Lottery Picker",
			fontSize = 18.sp,
			modifier = Modifier.align(alignment = Alignment.CenterVertically)
		)
	}
}


@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
	MyTopAppBar()

}