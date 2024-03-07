package com.dioses.jetpackcomposecatalog

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog
 * Created by Arthur Dioses Reto on 6/03/24 at 12:28
 * All rights reserved 2024.
 ****/

@Preview
@Composable
fun SimpleRecyclerView() {
    val myList = listOf("Arthur", "Felipe", "Dioses", "Reto")
    LazyColumn {
        item { Text(text = "Primer item") }
        items(7) {
            Text(text = "Este es el item $it")
        }

        items(myList) {
            Text(text = "Hola me llamo $it")
        }
    }
}