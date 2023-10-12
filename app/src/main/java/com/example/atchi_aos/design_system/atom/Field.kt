package com.example.atchi_aos.design_system.atom

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TextFieldTemplate(
    value: String,
    onValueChange: (String) -> Unit,
    color: Color
) {
    val purpleLight = Modifier
        .border(
            width = 2.dp,
            color = color,
            shape = RoundedCornerShape(size = 20.dp)
        )
        .width(340.dp)
        .height(65.dp)
        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 20.dp))
        .padding(start = 28.dp, top = 23.dp, end = 28.dp, bottom = 23.dp)

    Column(modifier = purpleLight) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            maxLines = 1,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
fun PurpleLightField(
    value: String,
    onValueChange: (String) -> Unit
)  {
    TextFieldTemplate(value = value,
        onValueChange = onValueChange,
        color = Color(0x337544C6))
}


@Composable
fun PurpleField(
    value: String,
    onValueChange: (String) -> Unit
)  {
    TextFieldTemplate(value = value,
        onValueChange = onValueChange,
        color = Color(0xFF7544C6))
}

@Preview
@Composable
fun PurpleLightFieldPreview() {
    var text by remember { mutableStateOf("NI") }
    PurpleLightField(value = text, onValueChange = { text = it })
}

@Preview
@Composable
fun PurpleFieldPreview() {
    var text by remember { mutableStateOf("NIhao") }
    PurpleField(value = text, onValueChange = { text = it })
}

