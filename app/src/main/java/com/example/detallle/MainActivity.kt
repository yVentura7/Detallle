package com.example.detallle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo), // Asegúrate de que el archivo se llame android_logo.png y esté en res/drawable
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        BasicText(
            text = "John Doe",
            style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        BasicText(
            text = "Software Developer",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 18.sp
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        BasicText(
            text = "+1 234 567 890",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 16.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        BasicText(
            text = "john.doe@example.com",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 16.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        BasicText(
            text = "john.doe@company.com",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 16.sp
            )
        )
    }
}
