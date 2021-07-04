package com.example.meditation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@ExperimentalFoundationApi
@Composable
fun HomePage() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
    ) {

        Column {

            Greeting()
            RoundedLinks()
            LazyShit()

        }
    }
}







//Inside Column
/*
                    DrawingSection(drawings = listOf(
                        Drawings(
                            title = "Blahhhh",
                            R.drawable.ic_launcher_foreground,
                            Color.Yellow,
                        ),
                        Drawings(
                            title = "Shitttt",
                            R.drawable.ic_launcher_background,
                            Color.Green
                        )
                    ))


 */