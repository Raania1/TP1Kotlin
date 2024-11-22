package com.example.tp1interfaces

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.tp1interfaces.ui.theme.TP1InterfacesTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TP1InterfacesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    //ThreeColorsScreen()
                    FourColorsScreen()
                }
            }
        }
    }
}

@Composable
fun ThreeColorsScreen() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Red)
        )

        Row(Modifier.weight(1f)) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue)
            )
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }
    }
}

@Composable
fun FourColorsScreen() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue)
            )
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }

        Row(Modifier.weight(1f)) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
            )
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewThreeColorsScreen() {
    TP1InterfacesTheme {
        ThreeColorsScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFourColorsScreen() {
    TP1InterfacesTheme {
        FourColorsScreen()
    }
}
