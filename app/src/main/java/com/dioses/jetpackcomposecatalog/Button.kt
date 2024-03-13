package com.dioses.jetpackcomposecatalog

import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog
 * Created by Arthur Dioses Reto on 12/03/24 at 9:21 PM
 * All rights reserved 2024.
 ****/

@Preview
@Composable
fun MyButtonM3() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Holaa")
    }
}

@Preview
@Composable
fun MyFilledTonalButton() {
    FilledTonalButton(onClick = { /*TODO*/ }) {
        Text(text = "Holaa")
    }
}

@Preview
@Composable
fun MyElevatedButton() {
    ElevatedButton(onClick = { /*TODO*/ }) {
        Text(text = "Holaa")
    }
}