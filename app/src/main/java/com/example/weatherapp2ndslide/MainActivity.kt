package com.example.weatherapp2ndslide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp2ndslide.ui.theme.Blue002
import com.example.weatherapp2ndslide.ui.theme.BlueMine
import com.example.weatherapp2ndslide.ui.theme.WeatherApp2ndslideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RealWeather()

                }
            }
        }


@Composable
fun RealWeather()
{
    Surface {
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = BlueMine),
        )
        {

            Column(
                modifier = Modifier
                    .fillMaxHeight(.5f)
                    .fillMaxWidth()
                    .background(
                        shape = RoundedCornerShape(
                            topStart = 30.dp, topEnd = 30.dp
                        ),
                        color = Color.White,
                    ),
                verticalArrangement = Arrangement.Center

                ) {
                DailyWeather()
                }

            }

        Column(
            modifier = Modifier
                .fillMaxHeight(.5f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
    Image(painterResource(id = R.drawable.rainsun), modifier =Modifier.size(150.dp), contentDescription = "Null")
            Spacer(modifier = Modifier.height(30.dp))
    Text (text = "28.0", fontSize = 70.sp)

        }

        Row(
            modifier = Modifier
                .fillMaxHeight(.25f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End

        )

        {
            IconButton(onClick = { /*TODO*/ })
            {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = null)

            }
        }
        Column (
            modifier= Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {

            Row(
                modifier = Modifier
                    .fillMaxHeight(.2f)
                    .fillMaxWidth(.7f)
                    .absolutePadding()
                    .background(Blue002, shape = RoundedCornerShape(20.dp))
            )
            {

            }
        }
        }

    }
@Composable
fun DailyWeather() {
    Card(
        modifier = Modifier
            .wrapContentSize()
            .padding(16.dp),
        shape = RoundedCornerShape(20.dp),
        backgroundColor = Blue002

    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)
        )
        {

            Image(
                painterResource(id = R.drawable.rainsun), contentDescription = null,
                modifier = Modifier
                    .padding(4.dp)
                    .size(30.dp)
            )

            Text(text = "1:12", fontSize = 15.sp)

            Text(text = "29.5", fontSize = 20.sp)

        }

    }
}