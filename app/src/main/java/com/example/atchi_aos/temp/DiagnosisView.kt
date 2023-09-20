package com.example.atchi_aos.temp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atchi_aos.temp.component.MmseStartComponent
import com.example.atchi_aos.temp.component.SelfCheckInfoView
import com.example.atchi_aos.design_system.theme.titleLarge

@Composable
fun DiagnosisView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        // page title
        Text(text = "진단", style = titleLarge)
        Spacer(modifier = Modifier.height(20.dp))

        // component

        Spacer(modifier = Modifier.height(20.dp))
        SelfCheckInfoView()
        Spacer(modifier = Modifier.height(20.dp))

        BoldLine()

        Spacer(modifier = Modifier.height(20.dp))
        MmseStartComponent()
    }
}

@Composable
fun BoldLine() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xF5F5F5),
                shape = RoundedCornerShape(20.dp) // 여기에서 radius를 설정합니다.
            )
    )
}

@Composable
@Preview(showBackground = true)
fun DiagnosisViewPreview() {
    DiagnosisView()
}

