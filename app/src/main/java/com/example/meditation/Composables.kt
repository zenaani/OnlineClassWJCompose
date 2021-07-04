package com.example.meditation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditation.ui.theme.MeditationTheme


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

@Composable
fun Greeting() {
    Box(modifier = Modifier
        .padding(24.dp)
        .fillMaxWidth()) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterStart)
        ) {
            Text(
                text = "Good Morning, Zen!",
                color = Black,
                fontSize = 20.sp,
                modifier = Modifier

            )
            Text(
                text = "Timetable",
                color = Black,
                fontSize = 35.sp,
                modifier = Modifier

            )


        }

    }



    Box () {

    }

}


@Composable
fun RoundedLinks() {

    LazyRow(modifier = Modifier.padding(20.dp,0.dp)) {
        itemsIndexed(
            listOf("SS","MAT","AC","CAM","COI")
        ) { index, item ->

            Box(
                modifier = Modifier
                    .size(75.dp)
                    .clip(RoundedCornerShape(75.dp))
                    .background(SecondaryColor)
            ) {
                Box(
                    modifier = Modifier
                        .size(65.dp)
                        .clip(RoundedCornerShape(65.dp))
                        .background(Color.White)
                        .align(Alignment.Center)
                ) {
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(RoundedCornerShape(60.dp))
                            .background(SecondaryColor)
                            .align(Alignment.Center)
                    ) {
                        Text(text = "$item", modifier = Modifier.align(Alignment.Center))
                    }
                }
            }
            Spacer(modifier = Modifier.padding(7.dp))


        }

    }
}

@ExperimentalFoundationApi
@Composable
fun DrawingSection(drawings: List<Drawings>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Drawings",
            modifier = Modifier.padding(15.dp)
        )

        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.fillMaxHeight()) {

            items(drawings.size) {
                DrawingItem(drawing = drawings[it])
            }

        }
    }
}

@Composable
fun DrawingItem(
    drawing: Drawings
) {
    BoxWithConstraints(
        modifier = Modifier
            .padding(12.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Magenta)

    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight


        //Medium Colored path
        val mediumColoredPoint1 = Offset(0f,height * 0.7f)
        val mediumColoredPoint2 = Offset(width * 0.1f,height * 0.7f)
        val mediumColoredPoint3 = Offset(width * 0.4f,height * 1f)
        val mediumColoredPoint4 = Offset(width * 0.75f,height * 0.7f)
        val mediumColoredPoint5 = Offset(width * 1.4f,-height.toFloat())


        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPoint1.x,mediumColoredPoint1.y)
            standardQuadFromTo(mediumColoredPoint1,mediumColoredPoint2)
            standardQuadFromTo(mediumColoredPoint2,mediumColoredPoint3)
            standardQuadFromTo(mediumColoredPoint3,mediumColoredPoint4)
            standardQuadFromTo(mediumColoredPoint4,mediumColoredPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f,height.toFloat() + 100f)
            close()

        }

        Canvas(
            modifier = Modifier
                .fillMaxSize()
        ) {
            drawPath(
                path = mediumColoredPath,
                color = drawing.mediumColor
            )
        }


        Box(modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)) {

            Text(
                text = drawing.title,
                modifier = Modifier.align(Alignment.TopStart)
            )

            Icon(
                painter = painterResource(id = drawing.iconid),
                contentDescription = drawing.title,
                modifier = Modifier.align(Alignment.BottomStart)
            )

            Text(
                text = "Start",
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier
                    .clickable {
                        //Click handle
                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.Blue)
                    .padding(6.dp, 15.dp)

            )
        }

    }

}





@ExperimentalFoundationApi
@Composable
fun LazyShit() {

    //val Subjects = listOf("Solid State Devices" , "Network Theory" , "Logic Circuit Design" , "Analog Circuits", "Signals And Systems")


    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp),
        modifier = Modifier
            .fillMaxHeight()
    ) {
        itemsIndexed(
            listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
        ) { index, string ->

            Box(
                modifier = Modifier
                    .padding(12.dp)
                    .clip(shape = RoundedCornerShape(25.dp))
                    .background(SecondaryColor)
                    .size(150.dp)
                ,
                contentAlignment = Alignment.Center
            ) {
                Text(text = "$string")
            }


        }
    }
}


@Composable
fun randomfunc() {

    Box(modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .fillMaxSize(0.8f)
        .background(Color.Red)
    ) {
        Text(text = "Testtttt")
    }

}





//Useful Reference

/*

LazyRow() {
                        itemsIndexed(
                            listOf("A","B","C","D","E","F")
                        ) { index, shit ->
                            Text(text = "$shit")
                        }
                    }



val blah = listOf("A","B","C","D")
                    Box(modifier = Modifier
                        .fillMaxSize()) {
                        Column {


                            LazyRow {
                                items(5) { blah
                                    Text(text = "$it")
                                }
                            }



                        }
                    }

 */