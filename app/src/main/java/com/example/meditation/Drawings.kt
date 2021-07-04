package com.example.meditation

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Drawings(
    val title: String,
    @DrawableRes val iconid: Int,
    val mediumColor: Color

    )
