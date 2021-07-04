package com.example.meditation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.Px
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.layoutId
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.meditation.ui.theme.MeditationTheme
import kotlinx.coroutines.NonDisposableHandle.parent

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
                        TimeTableGrid()
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
                TimeTableGrid()
            }


        }



    }
}







