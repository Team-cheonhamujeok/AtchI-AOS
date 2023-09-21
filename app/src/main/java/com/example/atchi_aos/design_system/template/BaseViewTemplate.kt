package com.example.atchi_aos.ui.sign

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ViewTemplate() {
    Column {
        Header()
        Body()
        Bottom()
    }
}

@Composable
private fun Header() {

}
@Composable
private fun Body() {

}

@Composable
private fun Bottom() {

}

@Preview
@Composable
fun ViewTemplatePreview() {
    ViewTemplate()
}