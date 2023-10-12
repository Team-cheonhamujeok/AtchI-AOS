package com.example.atchi_aos.presentation.intro.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atchi_aos.R
import com.example.atchi_aos.design_system.atom.MaxSizeWhiteSurface
import com.example.atchi_aos.design_system.atom.PurpleButton
import com.example.atchi_aos.design_system.atom.WhiteSurface

private val bodyHeight = 700.dp
private val defaultHorizontalPadding = Modifier.padding(horizontal = 20.dp)
private val blockGap = Modifier
    .fillMaxWidth()
    .height(16.dp)
    .fillMaxWidth()
    .height(9.dp)
private val bottomHeight = 100.dp

@Composable
fun Intro() {
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Body()
        Bottom()
    }
}

@Composable
private fun Body() {
    Column(modifier = WhiteSurface()) {
        Spacer(
            Modifier
                .height(100.dp)
                .fillMaxWidth()
        )
        Box(modifier = Modifier
            .height(400.dp)
            .padding(30.dp)
        )
        {
            Image(painter = painterResource(id = R.drawable.introimage),
                contentDescription = "앳치 메인 화면",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(
            Modifier
                .height(60.dp)
                .fillMaxWidth()
        )
        Box(defaultHorizontalPadding) {
            PurpleButton(text = "회원가입하기")
        }
    }
}

@Composable
private fun Bottom() {
    Column(MaxSizeWhiteSurface()) {
        Spacer(blockGap)
        Box(defaultHorizontalPadding.fillMaxWidth()) {
            Row(Modifier.align(Alignment.Center)) {
                Text("이미 가입하셨나요? ",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 25.2.sp,
                        //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF767676),
                        textAlign = TextAlign.Center
                    )
                )
                Text("회원가입하기",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 25.2.sp,
                        //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF767676),
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(bottomHeight))
    }
}

@Preview
@Composable
fun IntroPreview() {
    Intro()
}