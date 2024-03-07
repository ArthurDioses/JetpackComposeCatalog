package com.dioses.jetpackcomposecatalog.model

import androidx.annotation.DrawableRes

/****
 * Project: JetpackComposeCatalog
 * From: com.dioses.jetpackcomposecatalog.model
 * Created by Arthur Dioses Reto on 6/03/24 at 21:26
 * All rights reserved 2024.
 ****/
data class Superhero(
    var superheroName: String,
    var realName: String,
    var publisher: String,
    @DrawableRes var photo: Int
)
