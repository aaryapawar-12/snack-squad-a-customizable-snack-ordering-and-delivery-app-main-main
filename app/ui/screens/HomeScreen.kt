package com.snacksquad.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onCartClick: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Text("Welcome to Snack Squad!", style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = onCartClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("View Cart")
        }
    }
}
