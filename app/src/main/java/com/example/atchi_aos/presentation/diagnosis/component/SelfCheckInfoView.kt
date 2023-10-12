package com.example.atchi_aos.presentation.diagnosis.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.atchi_aos.design_system.theme.bodySmall
import com.example.atchi_aos.design_system.theme.light_main_background
import com.example.atchi_aos.design_system.theme.light_main_purple
import com.example.atchi_aos.design_system.theme.titleMedium
import com.example.atchi_aos.design_system.theme.titleSmall

@Composable
fun SelfCheckInfoView() {
    Column {
        Text(
            text = "치매 자가진단 해보세요",
            style = titleMedium
        )
        Text(
            text = "몇가지 질문으로 간단하게 치매 진단을 받아보세요",
            style = bodySmall
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(light_main_purple)
        ) {
            Text(
                text="자가진단 시작하기",
                style= titleSmall,
                color= light_main_background
            )
        }
    }
}