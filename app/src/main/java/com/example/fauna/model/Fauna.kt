package com.example.fauna.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Fauna(
    @StringRes val stringTitulo: Int,
    @StringRes val stringResourceId: Int, // Identificador de recurso de cadena para el nombre de la especie de fauna
    @StringRes val stringDescripcionId: Int, // Identificador de recurso de cadena para la descripción de la especie de fauna
    @DrawableRes val imageResourceId: Int // Identificador de recurso de dibujo para la imagen de la especie de fauna
)
