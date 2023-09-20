package com.example.atchi_aos.temp.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.atchi_aos.design_system.theme.bodySmall
import com.example.atchi_aos.design_system.theme.light_main_background
import com.example.atchi_aos.design_system.theme.light_main_purple
import com.example.atchi_aos.design_system.theme.titleMedium
import com.example.atchi_aos.design_system.theme.titleSmall

@Composable
fun MmseStartComponent() {
    Column {
        Text(
            text = "간단한 MMSE 검사를 해보세요",
            style = titleMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color(0xF5F5F5),
                    shape = RoundedCornerShape(20.dp) // 여기에서 radius를 설정합니다.
                )
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "💡 MMSE 검사란?",
                    style = titleSmall
                )
                Text(
                    text = "MMSE 검사는 인지 기능 평가 도구로 인지 손상, 치매 등의 질환을 조기에 발견하기 위한 검사입니다. 앱에서는 간략화한 검사를 제공하고 있으며, 보다 정확한 검사는 전문가와 상담하시길 권장드립니다.",
                    style = bodySmall
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(light_main_purple)
        ) {
            Text(
                text="간단 MMSE 검사 하기",
                style= titleSmall,
                color= light_main_background
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MmseStartComponentPreview() {
    MmseStartComponent()
}