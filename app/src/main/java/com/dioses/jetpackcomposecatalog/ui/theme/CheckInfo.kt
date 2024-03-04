package com.dioses.jetpackcomposecatalog.ui.theme

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog.ui.theme
 * Created by Arthur Dioses Reto on 4/03/24 at 15:53
 * All rights reserved 2024.
 ****/
data class CheckInfo(
    val title: String,
    var selected: Boolean = false,
    var onCheckedChange: (Boolean) -> Unit
)