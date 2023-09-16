package com.example.atchi_aos.ui.sign

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atchi_aos.ui.components.MaxSizeWhiteSurface
import com.example.atchi_aos.ui.components.PurpleButton
import com.example.atchi_aos.ui.components.PurpleField
import com.example.atchi_aos.ui.components.PurpleLightField
import com.example.atchi_aos.ui.components.PurpleToggleButton

private val headerHeight = 130.dp
private val bodyHeight = 340.dp
private val defaultHorizontalPadding = Modifier.padding(horizontal = 20.dp)
private val blockGap = Modifier
    .fillMaxWidth()
    .height(16.dp)
private val textBlockGap = Modifier
    .fillMaxWidth()
    .height(9.dp)
private val bottomHeight = 100.dp

@Composable
fun SignUp() {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        Header()
        Body()
        Bottom()
    }
}

@Composable
private fun Header() {
    Column {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(headerHeight)
                .background(Color.White)
        ) {
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(16.dp)
            )
            Text(
                text = "회원가입",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp, vertical = 30.dp),
                style = TextStyle(
                    fontSize = 34.sp,
                    lineHeight = 50.sp,
                    //fontFamily = FontFamily(Font(R.font.sf pro text)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )
        }
    }
}

@Composable
private fun Body() {
    Column(MaxSizeWhiteSurface()) {
        Text(text = "이름",
            modifier = defaultHorizontalPadding,
            style = TextStyle(
                fontSize = 18.sp,
                //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(textBlockGap)
        Box(defaultHorizontalPadding) {
            PurpleField(value = "N", onValueChange = {})
        }
        Spacer(blockGap)
        Text(text = "이메일",
            modifier = defaultHorizontalPadding,
            style = TextStyle(
                fontSize = 18.sp,
                //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(textBlockGap)
        Box(defaultHorizontalPadding) {
            PurpleLightField(value = "HI" , onValueChange = {})
        }
        Spacer(blockGap)
        Text(text = "성별",
            modifier = defaultHorizontalPadding,
            style = TextStyle(
                fontSize = 18.sp,
                //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(textBlockGap)
        Box(defaultHorizontalPadding) {
            var checked by remember {
                mutableStateOf(true)
            }
            PurpleToggleButton(
                checked = checked,
                onCheckedChange = {

                }
            )
        }
        Spacer(blockGap)
        Text(text = "생년월일",
            modifier = defaultHorizontalPadding,
            style = TextStyle(
                fontSize = 18.sp,
                //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(textBlockGap)
        Box(defaultHorizontalPadding) {
            PurpleLightField(value = "HI" , onValueChange = {})
        }
        Spacer(blockGap)
        Text(text = "비밀번호",
            modifier = defaultHorizontalPadding,
            style = TextStyle(
                fontSize = 18.sp,
                //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(textBlockGap)
        Box(defaultHorizontalPadding) {
            PurpleLightField(value = "HI" , onValueChange = {})
        }
        Spacer(blockGap)
        Text(text = "비밀번호 확인",
            modifier = defaultHorizontalPadding,
            style = TextStyle(
                fontSize = 18.sp,
                //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(textBlockGap)
        Box(defaultHorizontalPadding) {
            PurpleLightField(value = "HI" , onValueChange = {})
        }
        Spacer(Modifier.height(38.dp))
        Box(defaultHorizontalPadding) {
            PurpleButton(text = "로그인")
        }
    }
}

@Composable
private fun Bottom() {
    Column(MaxSizeWhiteSurface()) {
        Spacer(blockGap)
        Box(defaultHorizontalPadding
            .fillMaxWidth()
        ) {
            Row(Modifier.align(Alignment.Center)) {
                Text("계정이 없으신가요? ",
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
fun SignUpPreview() {
    SignUp()
}