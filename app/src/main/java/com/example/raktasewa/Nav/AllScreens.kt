package com.example.raktasewa.Nav

sealed class AllScreens {
    data object WelcomeScreen: AllScreens()
    data class HomeScreen(val language: String): AllScreens()
    data class LoadinScreen(val message:String): AllScreens()
}