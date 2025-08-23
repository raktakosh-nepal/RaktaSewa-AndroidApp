package com.example.raktasewa.Composables

import android.R
import android.view.RoundedCorner
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.animation.content.RoundedCornersContent
import com.example.raktasewa.Constants.Fonts
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.raktasewa.ViewModels.SearchBloodGroupViewModel


@Composable
fun BloodGroupCards(text: String, isClicked: Boolean, onClick: () -> Unit,) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clickable() {
                onClick()
            }.then(if (isClicked) Modifier.border(3.dp, Color(0xFF54BAF3), shape = RoundedCornerShape(12.dp)) else Modifier)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                "$text",
                fontFamily = Fonts.ManropeFamily,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(20.dp),
                style = TextStyle(fontSize = 20.sp)
            )
        }
    }
}