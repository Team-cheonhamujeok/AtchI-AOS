package com.example.atchi_aos.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atchi_aos.R

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp)
    ) {
        Box(modifier = modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Column(Modifier.fillMaxSize()) {
                Spacer(Modifier.weight(2.0f))
                Box(
                    Modifier
                        .background(Color.White)
                        .fillMaxSize()
                        .weight(1.0f)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = title,
                    // Title/Small
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 28.sp,
                        //fontFamily = FontFamily(Font(R.font.apple sd gothic neo)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFF000000),
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun ImageCardPreview() {
    val painter = painterResource(id = R.drawable.dementia_article_picture_1)
    val description = "hello Word"
    val title = "Super shy"

    ImageCard(
        painter = painter,
        contentDescription = description,
        title = title
    )
}