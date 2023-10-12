package com.example.atchi_aos.design_system.atom

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun LargeTitle(
    text: String
) {
    val style = TextStyle(
        fontSize = 34.sp,
        lineHeight = 50.sp,
        //fontFamily = Font,
        fontWeight = FontWeight(600),
        color = Color(0xFF000000),
    )

    Text(text = text,
        style = style)
}

@Preview
@Composable
fun LargeTitlePreview() {
    LargeTitle(text = "HI")
}


