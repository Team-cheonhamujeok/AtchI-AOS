package com.example.atchi_aos.ui.sign

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atchi_aos.R
import com.example.atchi_aos.ui.components.MaxSizeWhiteSurface
import com.example.atchi_aos.ui.components.MaxWidthWhiteSurface
import com.example.atchi_aos.ui.components.RoundedCard

@Composable
fun Home() {
    Column(
        modifier = MaxSizeWhiteSurface()
            .padding(25.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Header()
        Body()
    }
}
@Composable
private fun Header() {
    val logo: ImageVector = ImageVector.vectorResource(id = R.drawable.graylogo)

    Box(modifier = MaxWidthWhiteSurface(height = 60.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = logo,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "엣치",
                style = TextStyle(
                    fontSize = 18.sp,
                    //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF767676),
                )
            )
        }
    }
}
@Composable
private fun Body() {
    // AI 진단 Column
    Column {
        Text(
            text = "AI 진단",
            // Title/Medium
            style = TextStyle(
                fontSize = 22.sp,
                lineHeight = 28.sp,
                //fontFamily = FontFamily(Font(R.font.sf pro text)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Box(modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth()
            .height(340.dp))
        {
            RoundedCard(color = Color(0x334478C6)) {
                Column(modifier = Modifier.padding(25.dp)) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "치매 진단 결과",
                            // Title/Medium
                            style = TextStyle(
                                fontSize = 22.sp,
                                lineHeight = 28.sp,
                                //fontFamily = FontFamily(Font(R.font.sf pro text)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFF4478C6),
                            )
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Column(horizontalAlignment = Alignment.End) {
                            Text(
                                text = "23.02.01-23.03.01",
                                // Body/Tiny
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    lineHeight = 18.2.sp,
                                    //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFF767676),
                                    textAlign = TextAlign.Right,
                                )
                            )
                            Text(
                                text = "데이터 기준",
                                // Body/Tiny
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    lineHeight = 18.2.sp,
                                    //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFF767676),
                                    textAlign = TextAlign.Right,
                                )
                            )
                        }
                    }
                    Text(
                        text = "치매로 발전될 가능성이 있습니다.",
                        // Title/Small
                        style = TextStyle(
                            fontSize = 20.sp,
                            lineHeight = 28.sp,
                            //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                            fontWeight = FontWeight(600),
                            color = Color(0xFF000000),
                        )
                    )
                    // TODO: 그래프 넣기
                    Spacer(modifier = Modifier.weight(1.0f))
                    Text(
                        text = "*AI 진단 정보는 참고용입니다. 정확한 진단은 의사와 상담하세요.",

                        // Body/Tiny
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 18.2.sp,
                            //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF767676),
                        )
                    )
                }
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Spacer(Modifier.weight(1.0f))
            Text(
                text = "진단에 쓰이는 데이터 보러가기 ",
                // Body/Small
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 20.8.sp,
                    //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF767676),
                )
            )

            Image(
                modifier = Modifier
                    .scale(1.2f)
                    .padding(5.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.arrow_right),
                contentDescription = ""
            )
        }
    }
    // 컬럼 Spacer
    Spacer(Modifier
            .fillMaxWidth()
            .height(44.dp))
    // 바로 가기 Column
    Column {
        Text(
            text = "바로가기",
            // Title/Medium
            style = TextStyle(
                fontSize = 22.sp,
                lineHeight = 28.sp,
                //fontFamily = FontFamily(Font(R.font.sf pro text)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(Modifier.fillMaxWidth().height(16.dp))
        Row(Modifier.fillMaxWidth()) {
            Box(Modifier.height(180.dp).width(160.dp)) {
                RoundedCard(color = Color(0x337544C6)) {
                    Column(Modifier.fillMaxSize().padding(20.dp)) {
                        Text(
                            text = "자가진단",

                            // Title/Medium
                            style = TextStyle(
                                fontSize = 22.sp,
                                lineHeight = 28.sp,
                                //fontFamily = FontFamily(Font(R.font.sf pro text)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFF7544C6),
                            )
                        )
                        Text(
                            text = "혹시 치매일까 \n의심된다면",

                            // Body/Small
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 20.8.sp,
                                //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                            )
                        )
                        Spacer(Modifier.weight(1.0f))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "바로가기",
                                // Body/Small
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    //
                                    // fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                                    fontWeight = FontWeight(600),
                                    color = Color(0xFF000000),
                                )
                            )

                            Image(
                                modifier = Modifier
                                    .scale(1.2f)
                                    .padding(5.dp),
                                imageVector = ImageVector.vectorResource(id = R.drawable.arrow_right),
                                contentDescription = ""
                            )
                        }
                    }
                }
            }
            Spacer(Modifier.weight(1.0f))
            Box(Modifier.height(180.dp).width(160.dp)) {
                RoundedCard(color = Color(0x337544C6)) {
                    Column(Modifier.fillMaxSize().padding(20.dp)) {
                        Text(
                            text = "퀴즈풀기",

                            // Title/Medium
                            style = TextStyle(
                                fontSize = 22.sp,
                                lineHeight = 28.sp,
                                //fontFamily = FontFamily(Font(R.font.sf pro text)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFF7544C6),
                            )
                        )
                        Text(
                            text = "뇌훈련을 통해 \n치매 예방하기",

                            // Body/Small
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 20.8.sp,
                                //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                            )
                        )
                        Spacer(Modifier.weight(1.0f))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "바로가기",
                                // Body/Small
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    //
                                    // fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                                    fontWeight = FontWeight(600),
                                    color = Color(0xFF000000),
                                )
                            )

                            Image(
                                modifier = Modifier
                                    .scale(1.2f)
                                    .padding(5.dp),
                                imageVector = ImageVector.vectorResource(id = R.drawable.arrow_right),
                                contentDescription = ""
                            )
                        }
                    }
                }
            }
        }
    }
    // 컬럼 Spacer
    Spacer(Modifier
        .fillMaxWidth()
        .height(44.dp))

}


@Preview
@Composable
fun HomePreview() {
    Home()
}