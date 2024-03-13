package com.dioses.jetpackcomposecatalog.model

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog.model
 * Created by Arthur Dioses Reto on 12/03/24 at 7:12 PM
 * All rights reserved 2024.
 ****/
sealed class Routes(val route: String) {
    object Pantalla1 : Routes("pantalla1")
    object Pantalla2 : Routes("pantalla2")
    object Pantalla3 : Routes("pantalla3")
    object Pantalla4 : Routes("pantalla4/{age}") {
        fun createRoute(age: Int) = "pantalla4/$age"
    }

    object Pantalla5 : Routes("pantalla5?name={name}") {
        fun createRoute(name: String) = "pantalla5?name=$name"
    }
}