package com.dioses.jetpackcomposecatalog

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.dioses.jetpackcomposecatalog.model.Routes

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog
 * Created by Arthur Dioses Reto on 12/03/24 at 6:47 PM
 * All rights reserved 2024.
 ****/

@Composable
fun Screen1(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(
            text = "Pantalla 1",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Routes.Pantalla2.route) })
    }
}

@Composable
fun Screen2(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(text = "Pantalla 2", modifier = Modifier
            .align(Alignment.Center)
            .clickable { navController.navigate(Routes.Pantalla3.route) })
    }
}

@Composable
fun Screen3(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {
        Text(text = "Pantalla 3", modifier = Modifier
            .align(Alignment.Center)
            .clickable { navController.navigate(Routes.Pantalla1.route) })
    }
}