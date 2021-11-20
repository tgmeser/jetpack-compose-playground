package com.babyapps.composebasics

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.style.StrikethroughSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.babyapps.composebasics.ui.theme.ComposeBasicsTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(Color.Yellow)
                }

                ColorBox(
                    Modifier
                        .weight(1f)
                        .fillMaxSize()
                ){
                    //Bu Lambda bloğu 2.parametredir yani alttaki ColorBox metodundaki updateColor kısmı
                    color.value=it
                    //tıkladıkça random olarak gelen yeni renk değeri (it), color state' ine veriliyor
                }


                //Alttaki kutunun rengini yukardaki "color" statinden aldı
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(color.value) //color.value yukarda color.value=it satırında alınan değerden gelir
                        .fillMaxSize()
                )
            }


        }
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier, updateColor: (Color) -> Unit) {

    /*
    val color = remember {
        //remember : Her ColorBox metodu çalıştığında tekrar tekrar Sarı rengi kurma, Sarı Rengi HATIRLA!
        mutableStateOf(Color.Yellow)
    }

     */

    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }) {

    }
}
