package com.example.atchi_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContent {
            SampleText(Message("hihi", "ihihihihih"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun SampleText(msg: Message) {
    Column {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}