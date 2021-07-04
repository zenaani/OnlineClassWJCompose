package com.example.meditation

import android.content.Intent
import android.net.Uri
import androidx.annotation.Px
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity


@Composable
fun GradientBackground() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        MaterialTheme.colors.primary,
                        MaterialTheme.colors.primaryVariant
                    )
                )
            )
    ) {

    }
}

@Composable
fun Heading(modifier: Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    )   {

        Text(
            text = "TimeTable",
            modifier = Modifier
                .align(Alignment.Center),
            fontSize = 36.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif
        )
        
        Spacer(modifier = Modifier.padding(12.dp))

    }

}

@Composable
fun WeekDaysSelection() {

    LazyRow(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        itemsIndexed(
            listOf("M", "T", "W", "T", "F", "S")
        ) { index, weekdays ->

            Text(
                text = "$weekdays",
                fontSize = 18.sp,
                color = Color.White
            )

        }

    }
}


@Composable
fun TimeTableGrid() {

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(14.dp))
            .fillMaxSize()
            .background(color = PrimaryColor)
            .padding(25.dp)
    ) {

        Row() {


            LazyColumn(modifier = Modifier.weight(0.5f)) {

                itemsIndexed(
                    listOf("9.00 - 10.00", "10.10 - 11.10", "11.20 - 12.20", "12.30 - 1.30", "2.00 - 3.00")
                ) { index, timing ->

                    Button(

                        modifier = Modifier
                            .clip(RoundedCornerShape(14.dp))
                            .fillMaxWidth()
                            .size(95.dp)
                            .background(color = Color.White),
                        onClick =  {

                    }) {

                        Text(
                            text = "$timing",
                            fontSize = 16.sp,
                            modifier = Modifier
                                .padding(12.dp)
                        )
                    }

                    Spacer(modifier = Modifier.padding(15.dp))

                }
            }
            
            Spacer(modifier = Modifier.padding(14.dp))

            LazyColumn(modifier = Modifier.weight(0.5f)) {

                itemsIndexed(
                    listOf("SS", "AC", "Mat", "COI", "PE")
                ) { index, subject ->

                    Button(
                        modifier = Modifier
                            .clip(RoundedCornerShape(14.dp))
                            .fillMaxWidth()
                            .size(95.dp)
                            .background(color = Color.White),
                        onClick = {

                        }) {

                        Text(text = "$subject", fontSize = 20.sp, modifier = Modifier
                            .padding(12.dp)
                        )

                    }

                    Spacer(modifier = Modifier.padding(15.dp))

                }
            }
        }
    }
}

/*
fun goToUrl(url: String) {
    val i = Intent(Intent.ACTION_VIEW)
    i.data = Uri.parse(url)
    startActivity(i)
}

 */