package com.example.atchi_aos.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PurpleButton(
    text: String
) {
    val modifier = Modifier
        .width(340.dp)
        .height(65.dp)
        .background(color = Color(0xFF7544C6), shape = RoundedCornerShape(size = 20.dp))

    Column(modifier = modifier) {
        Button(
            modifier = Modifier.fillMaxSize(),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFF7544C6), contentColor = Color.White),
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = text,
                // Title/Small
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 28.sp,
                    //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center
                )
            )
        }
    }
}
@Composable
fun PurpleToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val modifier = Modifier
        .width(340.dp)
        .height(65.dp)
        .border(
            width = 2.dp,
            color = Color(0xFF7544C6),
            shape = RoundedCornerShape(size = 20.dp)
        )
        .clip(RoundedCornerShape(size = 20.dp))

    Row(modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Button(
            modifier = Modifier
                            .width(170.dp)
                            .fillMaxHeight(),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFF7544C6), contentColor = Color.White),
            onClick = { /*TODO*/ },
            shape = RectangleShape
        ) {
            Text(
                text = "남",
                // Title/Small
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 28.sp,
                    //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center
                )
            )
        }

        Button(
            modifier = Modifier
                            .width(170.dp)
                            .fillMaxHeight(),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFFFFFFFF), contentColor = Color.White),
            onClick = { /*TODO*/ },
            shape = RectangleShape
        ) {
            Text(
                text = "여",
                // Title/Small
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 28.sp,
                    //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF7544C6),
                    textAlign = TextAlign.Center
                )
            )
        }
    }
}

@Preview
@Composable
fun PurpleButtonPreview() {
    PurpleButton(text = "로그인하기 ")
}

@Preview
@Composable
fun PurpleToggleButtonPreview() {
    var checked by remember {
        mutableStateOf(true)
    }

    PurpleToggleButton(
        checked = checked,
        onCheckedChange = { change ->
            checked = change
        }
    )
}