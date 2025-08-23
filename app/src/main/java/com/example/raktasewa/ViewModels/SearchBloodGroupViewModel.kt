package com.example.raktasewa.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SearchBloodGroupViewModel : ViewModel() {
    var selectedBloodGroup by mutableStateOf<String?>(null)

    fun selectBloodGroup(group: String) {
        selectedBloodGroup = if (selectedBloodGroup == group) null else group
    }

}