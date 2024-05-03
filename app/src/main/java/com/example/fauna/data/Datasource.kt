package com.example.fauna.data

import com.example.fauna.model.Fauna
import com.example.fauna.R

class Datasource {
    // Función para cargar una lista de especies de fauna con sus imágenes asociadas
    fun loadFauna(): List<Fauna> {

        return listOf(
            Fauna(R.string.titulo1,R.string.fauna1,R.string.fauna1Descripcion, R.drawable.image1),
            Fauna(R.string.titulo2,R.string.fauna2,R.string.fauna2Descripcion, R.drawable.image2),
            Fauna(R.string.titulo3,R.string.fauna3,R.string.fauna3Descripcion, R.drawable.image3),
            Fauna(R.string.titulo4,R.string.fauna4,R.string.fauna4Descripcion, R.drawable.image4),
            Fauna(R.string.titulo5,R.string.fauna5,R.string.fauna5Descripcion, R.drawable.image5),
            Fauna(R.string.titulo6,R.string.fauna6,R.string.fauna6Descripcion, R.drawable.image6),
            Fauna(R.string.titulo7,R.string.fauna7,R.string.fauna7Descripcion, R.drawable.image7),
            Fauna(R.string.titulo8,R.string.fauna8, R.string.fauna8Descripcion,R.drawable.image8),
            Fauna(R.string.titulo9,R.string.fauna9,R.string.fauna9Descripcion, R.drawable.image9),
            Fauna(R.string.titulo10,R.string.fauna10,R.string.fauna10Descripcion, R.drawable.image10)
        )
    }
}
