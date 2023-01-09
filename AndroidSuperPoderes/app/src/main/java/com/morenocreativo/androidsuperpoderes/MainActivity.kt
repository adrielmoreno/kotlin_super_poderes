package com.morenocreativo.androidsuperpoderes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.morenocreativo.androidsuperpoderes.ui.theme.AndroidSuperPoderesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidSuperPoderesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showSystemUi = true, device = Devices.NEXUS_6)
@Composable
fun DefaultPreviewNEXUS_6() {
    AndroidSuperPoderesTheme {
        Greeting("Android")
    }
}

@Preview(name = "Nexus 10", showSystemUi = true, device = Devices.NEXUS_10)
@Composable
fun DefaultPreviewNEXUS_10() {
    AndroidSuperPoderesTheme {
        Greeting("Android")
    }
}

