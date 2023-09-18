package com.example.atchi_aos.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atchi_aos.R

@Composable
fun RoundedCard(
    color: Color,
    contents: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(25.dp),
        colors = CardDefaults.cardColors(color)
    ) {
        contents()
    }
}

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
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black,
                        ),
                        startY = 300f
                    )
                ))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}

@Preview
@Composable
fun RoundedCardPreview() {
    Column(modifier = Modifier
        .height(150.dp)
        .width(150.dp)) {
        RoundedCard(color = Color(0xFF7544C6)) {
            Text(
                text = "HI",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                textAlign = TextAlign.Center
            )
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