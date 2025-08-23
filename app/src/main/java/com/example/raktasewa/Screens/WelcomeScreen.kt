package com.example.raktasewa.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.raktasewa.Composables.CustomButton
import com.example.raktasewa.Nav.AllScreens
import com.example.raktasewa.R

@Composable
fun WelcomeScreen(backStack: SnapshotStateList<AllScreens>) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.welcome))


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieAnimation(composition = composition, modifier = Modifier.size(300.dp))
        Text("भाषा चयन गर्नुहोस्", style = TextStyle(fontSize = 32.sp))
        CustomButton(Color.Gray, "नेपाली") {
            backStack.removeLastOrNull()
            backStack.add(AllScreens.HomeScreen("Nep"))
        }
        CustomButton(Color.DarkGray, "English") {
            backStack.removeLastOrNull()
            backStack.add(AllScreens.HomeScreen("Eng"))
        }
    }
}