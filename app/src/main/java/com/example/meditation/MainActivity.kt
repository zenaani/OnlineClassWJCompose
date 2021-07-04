package com.example.meditation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.meditation.ui.theme.MeditationTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationTheme {

                GradientBackground()

                Column(Modifier.padding(18.dp,15.dp)) {

                    val navController = rememberNavController()



                    Spacer(modifier = Modifier.weight(0.1f))

                    Heading(modifier = Modifier.weight(0.1f))

                    Box(modifier = Modifier
                        .weight(0.05f)
                        .padding(50.dp, 0.dp)) {
                        WeekDaysSelection()
                    }

                    Box(modifier = Modifier.weight(0.8f)) {
                        TimeTableGrid("CAM","SS", "AC", "PE", "COI")
                    }

                    Box() {
                        NavHost(navController = navController, startDestination = "monday") {
                            composable("monday") { Monday(navController = navController) }
                            composable("tuesday") { Tuesday(navController = navController) }

                        }
                    }




                }












            }
        }
    }

}








@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MeditationTheme {

        GradientBackground()

        Column(Modifier.padding(18.dp,15.dp)) {

            Spacer(modifier = Modifier.weight(0.1f))

            Heading(modifier = Modifier.weight(0.1f))

            Box(modifier = Modifier
                .weight(0.05f)
                .padding(50.dp, 0.dp)) {
                WeekDaysSelection()
            }

            Box(modifier = Modifier.weight(0.8f)) {
                TimeTableGrid("CAM","SS", "AC", "PE", "COI")

            }


        }



    }
}







