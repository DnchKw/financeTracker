package com.dnchkw.financetracker.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dnchkw.financetracker.ui.navigation.Destinations

@Composable
fun AppInfo(
    navController: NavController
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Welcome to \nFinance Tracker",
            textAlign = TextAlign.Center,
//            color = TextColor,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text = "An app to track your\nmonthly spent",
            textAlign = TextAlign.Left,
//            color = TextColor,
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(90.dp))
        Button(
            onClick = { navController.navigate(Destinations.CreateBalance.route) },
//            colors = ButtonDefaults.buttonColors(
//                containerColor = MaterialTheme.colorScheme.inverseSurface,
//                contentColor = MaterialTheme.colorScheme.surface,
//                disabledContainerColor = Color.Unspecified,
//                disabledContentColor = Color.Unspecified
//            )
        ) {
            Text(
                text = "Go next",
                textAlign = TextAlign.Center,
//                color = TextColor,
                fontSize = 22.sp
            )
        }
    }
}