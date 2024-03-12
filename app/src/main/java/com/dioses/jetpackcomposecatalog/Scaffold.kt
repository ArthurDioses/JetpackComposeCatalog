package com.dioses.jetpackcomposecatalog

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Dangerous
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog
 * Created by Arthur Dioses Reto on 8/03/24 at 19:07
 * All rights reserved 2024.
 ****/

@Composable
fun MyModalDrawer(onCloseDrawer: () -> Unit) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = "Primera opción",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { onCloseDrawer() })
        Text(text = "Segunda opción",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { onCloseDrawer() })
        Text(text = "Tercera opción",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { onCloseDrawer() })
        Text(text = "Cuarta opción",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { onCloseDrawer() })

    }
}

@Composable
fun MyFAB() {
    FloatingActionButton(onClick = {}, containerColor = Color.Yellow, contentColor = Color.White) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "add")
    }
}

@Composable
fun MyBottomNavigation() {
    var index by remember {
        mutableStateOf(0)
    }
    NavigationBar(containerColor = Color.Red, contentColor = Color.Black) {
        NavigationBarItem(selected = index == 0, onClick = { index = 0 }, icon = {
            Icon(
                imageVector = Icons.Default.Home, contentDescription = "home"
            )
        }, label = {
            Text(text = "Home")
        })
        NavigationBarItem(selected = index == 1, onClick = { index = 1 }, icon = {
            Icon(
                imageVector = Icons.Default.Favorite, contentDescription = "Fav"
            )
        }, label = {
            Text(text = "FAV")
        })
        NavigationBarItem(selected = index == 2, onClick = { index = 2 }, icon = {
            Icon(
                imageVector = Icons.Default.Person, contentDescription = "person"
            )
        }, label = {
            Text(text = "Person")
        })
    }
}

@ExperimentalMaterial3Api
@Composable
fun ScaffoldExample() {
    val snackbarHostState = remember {
        SnackbarHostState()
    }
    val coroutineScope = rememberCoroutineScope()

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawer(drawerContent = {
        ModalDrawerSheet {
            MyModalDrawer() {
                coroutineScope.launch {
                    drawerState.close()
                }
            }
        }
    }, drawerState = drawerState) {
        Scaffold(
            topBar = {
                MyTopAppBar(onClickIcon = {
                    coroutineScope.launch {
                        snackbarHostState.showSnackbar("Has pulsado aquí $it")
                    }
                }, onClickDrawer = {
                    coroutineScope.launch {
                        drawerState.open()
                    }
                })
            },
            snackbarHost = {
                SnackbarHost(snackbarHostState)
            },
            bottomBar = {
                MyBottomNavigation()
            },
            floatingActionButton = { MyFAB() },
            floatingActionButtonPosition = FabPosition.Center,
            //isFloatingActionButtonDocked = true //not fount in Material 33

        ) {}
    }
}

@ExperimentalMaterial3Api
@Composable
fun MyTopAppBar(onClickIcon: (String) -> Unit, onClickDrawer: () -> Unit) {
    Surface(shadowElevation = 4.dp) {
        TopAppBar(title = {
            Text(text = "Mi Primera toolbar")
        }, colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Red,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        ), navigationIcon = {
            IconButton(onClick = { onClickDrawer() }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu")
            }
        }, actions = {
            IconButton(onClick = { onClickIcon("Buscar") }) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "search")
            }
            IconButton(onClick = { onClickIcon("Peligro") }) {
                Icon(imageVector = Icons.Filled.Dangerous, contentDescription = "dangerous")
            }
        })
    }
}