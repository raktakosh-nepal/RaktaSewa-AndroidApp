package com.example.raktasewa.Screens


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.raktasewa.Composables.BloodGroupCards
import com.example.raktasewa.Composables.CustomButton
import com.example.raktasewa.Constants.Fonts
import com.example.raktasewa.Nav.AllScreens
import com.example.raktasewa.ViewModels.SearchBloodGroupViewModel

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    val backstack = remember { mutableStateListOf<AllScreens>(AllScreens.WelcomeScreen) }
    HomeScreen(backstack, "English")
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ViewModelConstructorInComposable")
@Composable
fun HomeScreen(backStack: SnapshotStateList<AllScreens>, language: String, viewModel: SearchBloodGroupViewModel= viewModel()) {
    val data = listOf<String>("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-")
    if (language.equals("Nep")) {
        // Display the contents in Nepali
    } else {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    "Select Blood Group",
                    fontFamily = Fonts.ManropeFamily,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 20.sp)
                )
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2), // 3 columns
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(data.size) { item ->
                        val bloodGroup = data[item]
                        BloodGroupCards(
                            text = bloodGroup,
                            isClicked = viewModel.selectedBloodGroup == bloodGroup,
                            onClick = { viewModel.selectBloodGroup(bloodGroup) }
                        )
                    }
                }
                if(viewModel.selectedBloodGroup!=null){
                    CustomButton(color = Color(0xFF54BAF3), text = "Search for blood") {
                        backStack.add(AllScreens.LoadinScreen("Fetching data from blood banks"))
                    }
                }
            }
        }
    }

}