package com.tahadeta.androidsecuritystarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.tahadeta.androidsecuritystarter.ui.components.HomeTitle
import com.tahadeta.androidsecuritystarter.ui.theme.AndroidSecurityStarterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidSecurityStarterTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()) { innerPadding ->
                    HomeTitle(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
