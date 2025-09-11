package com.example.examen_1p

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.examen_1p.ui.theme.Examen_1PTheme
import com.example.examen_1p.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen_1PTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BackgroundImage(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun Fay (){
    Column (verticalArrangement = Arrangement.Center, modifier = Modifier){
        val image = painterResource(id = R.drawable.fi_render)
            Image(
                painter = image,
                modifier = Modifier.fillMaxSize(),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                alpha = 0.60f
            )

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Card() {
        Text(
            text="Fay es formal, servicial y sensata. La mayor parte del tiempo es inexpresiva, analítica y muy sabia. Se expresiva de manera tecnológica, robótica y sin emoción. Se refiere a Link como \"amo\" al estar diseñada para guiarlo. Por esto, ella además le importa su bienestar y hace lo posible para protegerle.",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 20.sp,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Cyan,
                    offset = Offset(5.0f, 5.0f),
                    blurRadius = 2f
                )
            ),
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun BackgroundImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.zelda_wallpaper)
    Box {
        Image(
            painter = image,
            modifier = modifier.fillMaxSize(),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            alpha = 0.60f
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Examen_1PTheme {
        BackgroundImage()
    }
}