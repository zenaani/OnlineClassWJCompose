package com.example.meditation

/*

package com.example.meditation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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

                HomePage()

                NavMenu()

            }
        }
    }

}

@ExperimentalFoundationApi
@Composable
fun NavMenu() {
    BoxWithConstraints() {

        val width = constraints.maxWidth
        val height = constraints.maxHeight

        val point1 = Offset(0f, height * 0.95f)
        val point2 = Offset(width * 0.4f, height * 0.85f)
        val point3 = Offset(width * 0.9f, height * 0.95f)
        val point4 = Offset(width * 1.4f, height * 0.9f)


        val SomePath = Path().apply {
            moveTo(point1.x, point1.y)
            standardQuadFromTo(point1, point2)
            standardQuadFromTo(point2, point3)
            standardQuadFromTo(point3, point4)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)

            close()
        }

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(path = SomePath, color = Color.White)

        }
    }
}






@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MeditationTheme {

        HomePage()
    }
}









 */