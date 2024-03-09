package com.dioses.jetpackcomposecatalog

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Dangerous
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog
 * Created by Arthur Dioses Reto on 8/03/24 at 19:07
 * All rights reserved 2024.
 ****/

@ExperimentalMaterial3Api
@Composable
fun ScaffoldExample() {
    Scaffold(topBar = {
        MyTopAppBar()
    }) {}
}

@ExperimentalMaterial3Api
@Composable
fun MyTopAppBar() {
    Surface(shadowElevation = 4.dp) {
        TopAppBar(
            title = {
                Text(text = "Mi Primera toolbar")
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Red,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "back")
                }
            }, actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "search")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.Dangerous, contentDescription = "dangerous")
                }
            }
        )
    }
}