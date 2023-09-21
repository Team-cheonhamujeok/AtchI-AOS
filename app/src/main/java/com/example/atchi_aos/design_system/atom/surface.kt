package com.example.atchi_aos.design_system.atom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun MaxSizeWhiteSurface(): Modifier {
    return Modifier
        .fillMaxSize()
        .background(Color.White)
}

@Composable
fun MaxWidthWhiteSurface(height: Dp): Modifier {
    return Modifier
        .fillMaxWidth()
        .height(height = height)
        .background(Color.White)
}

fun WhiteSurface(): Modifier {
    return Modifier
        .fillMaxWidth()
        .background(Color.White)
}