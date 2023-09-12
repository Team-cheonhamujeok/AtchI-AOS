package com.example.atchi_aos.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PurpleLightField(
    text: String
) {
    val purpleLight = Modifier
        .border(
            width = 2.dp,
            color = Color(0x337544C6),
            shape = RoundedCornerShape(size = 20.dp)
        )
        .width(340.dp)
        .height(65.dp)
        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 20.dp))
        .padding(start = 28.dp, top = 23.dp, end = 86.dp, bottom = 23.dp)

    Box(modifier = purpleLight) {
        Text(text = "$text")
    }
}

@Composable
fun PurpleField(
    text: String
) {
    val purpleLight = Modifier
        .border(
            width = 2.dp,
            color = Color(0xFF7544C6),
            shape = RoundedCornerShape(size = 20.dp)
        )
        .width(340.dp)
        .height(65.dp)
        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 20.dp))
        .padding(start = 28.dp, top = 23.dp, end = 86.dp, bottom = 23.dp)

    Box(modifier = purpleLight) {
        Text(text = "$text")
    }
}

@Preview
@Composable
fun PurpleLightFieldPreview() {
    PurpleLightField(text = "hello world")

}

@Preview
@Composable
fun PurpleFieldPreview() {
    PurpleField(text = "hello world")
}

