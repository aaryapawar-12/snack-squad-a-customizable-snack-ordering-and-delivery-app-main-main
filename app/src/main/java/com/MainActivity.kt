package com.snacksquad.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.snacksquad.app.navigation.AppNavigation
import com.snacksquad.app.theme.SnackSquadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnackSquadTheme {
                AppNavigation()
            }
        }
    }
}
