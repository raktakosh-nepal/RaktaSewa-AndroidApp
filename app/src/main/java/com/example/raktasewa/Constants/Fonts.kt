package com.example.raktasewa.Constants

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.raktasewa.R

class Fonts {
    companion object{
        val ManropeFamily= FontFamily(
            Font(R.font.manrope_bold, FontWeight.Bold),
            Font(R.font.manrope_extrabold, FontWeight.ExtraBold),
            Font(R.font.manrope_extralight, FontWeight.ExtraLight),
            Font(R.font.manrope_light, FontWeight.Light),
            Font(R.font.manrope_medium, FontWeight.Medium),
            Font(R.font.manrope_regular, FontWeight.Normal),
            Font(R.font.manrope_semibold, FontWeight.SemiBold)
        )
    }
}