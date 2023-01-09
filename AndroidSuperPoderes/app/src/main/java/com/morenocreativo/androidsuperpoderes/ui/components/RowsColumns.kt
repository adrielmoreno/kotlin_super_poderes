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
fun MyRow() {
    Row(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Gray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Box(modifier = Modifier
            .size(30.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .size(30.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(30.dp)
            .background(Color.Yellow))
//        Box(modifier = Modifier
//            .size(30.dp)
//            .background(Color.Cyan))
//        Box(modifier = Modifier
//            .size(30.dp)
//            .background(Color.Black))
//        Box(modifier = Modifier
//            .size(30.dp)
//            .background(Color.LightGray))
    }
}


@Preview
@Composable
fun MyColumn() {
    Column(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Gray),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement =  Arrangement.SpaceAround
    ) {
        Box(modifier = Modifier
            .size(30.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .size(30.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(30.dp)
            .background(Color.Yellow))
    }
}