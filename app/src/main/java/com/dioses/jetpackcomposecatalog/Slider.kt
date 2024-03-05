package com.dioses.jetpackcomposecatalog

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog
 * Created by Arthur Dioses Reto on 5/03/24 at 10:45
 * All rights reserved 2024.
 ****/

@Composable
fun BasicSlider() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var sliderPosition by remember {
            mutableStateOf(0f)
        }
        Slider(value = sliderPosition, onValueChange = {
            sliderPosition = it
        })
        Text(text = sliderPosition.toString())
    }
}

@Composable
fun AdvanceSlider() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var sliderPosition by remember {
            mutableStateOf(0f)
        }
        var completeValue by remember {
            mutableStateOf("")
        }
        Slider(
            value = sliderPosition,
            onValueChange = {
                sliderPosition = it
            },
            onValueChangeFinished = {
                completeValue = sliderPosition.toString()
            },
            valueRange = 0f..10f,
            steps = 9,
            enabled = false
        )
        Text(text = completeValue)
    }
}