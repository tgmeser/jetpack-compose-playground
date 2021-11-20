package com.babyapps.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.babyapps.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(color = Color.DarkGray)
                    .fillMaxHeight(0.5f)
                    .width(300.dp)
                    .padding(10.dp)
                    //.padding(top = 20.dp)
                    // .padding(start = 70.dp)
                    //.padding(end = 50.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)
                    .border(5.dp, color = Color.Black)
                    .padding(5.dp)
                    .border(10.dp, color = Color.Green)
                    .padding(10.dp)
                    .border(5.dp, color = Color.Blue)
                    .padding(5.dp)
            ) {
                Text(
                    text = "Hey",
                    color = Color.Yellow,
                    modifier = Modifier.border(5.dp, color = Color.Red)
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "There",
                    color = Color.Cyan,
                    modifier = Modifier.border(5.dp, color = Color.Magenta).padding(5.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "People", color = Color.Magenta,modifier=Modifier.clickable {
                    println("Clicked on text!")
                })
            }


        }
    }
}

