package com.morenocreativo.androidsuperpoderes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyBox() {
    Box(modifier = Modifier
        .size(400.dp)
        .background(Color.Green)
        ) {

        Box(modifier = Modifier
            .size(300.dp)
            .background(Color.Red)
            .align(Alignment.Center)) {

            Box(modifier = Modifier
                .size(50.dp)
                .background(Color.White)
                .align(Alignment.TopStart))

            Box(modifier = Modifier
                .size(80.dp)
                .background(Color.Blue)
                .align(Alignment.CenterEnd))
        }

        Box(modifier = Modifier
            .size(120.dp)
            .background(Color.Black)
            .align(Alignment.BottomStart))

        Box(modifier = Modifier
            .height(340.dp)
            .width(120.dp)
            .background(Color.Gray)
            .align(Alignment.Center))
    }
}