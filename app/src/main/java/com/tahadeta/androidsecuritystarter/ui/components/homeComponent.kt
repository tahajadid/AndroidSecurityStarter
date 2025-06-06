package com.tahadeta.androidsecuritystarter.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tahadeta.androidsecuritystarter.ui.theme.AndroidSecurityStarterTheme
import com.tahadeta.androidsecuritystarter.util.SecureWording

@Composable
fun HomeTitle(modifier: Modifier = Modifier) {
    Column(
        modifier =
            modifier
                .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Android Security Starter",
            fontSize = 24.sp,
            color = Color.LightGray,
            )

        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = SecureWording().getSecretWord(),
            fontSize = 30.sp,
            color = Color.DarkGray,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidSecurityStarterTheme {
        HomeTitle()
    }
}
