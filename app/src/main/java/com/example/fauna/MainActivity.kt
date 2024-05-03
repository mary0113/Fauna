package com.example.fauna

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fauna.data.Datasource
import com.example.fauna.model.Fauna
import com.example.fauna.ui.theme.FaunaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FaunaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FaunaApp()
                }
            }
        }
    }
}


@Composable
fun FaunaApp() {
    // Llama a la función FaunaList para mostrar la lista de fauna
    FaunaList(
        faunaList = Datasource().loadFauna(),
    )
}


@Composable
fun FaunaList(faunaList: List<Fauna>, modifier: Modifier = Modifier) {
    // Un LazyColumn que muestra una lista de elementos de fauna
    LazyColumn(modifier = modifier) {
        item {
            // Muestra el título "Fauna de la región" antes de la lista de fauna
            Text(
                text = "Fauna de la región",
                modifier = Modifier
                    .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
            )
        }
        items(faunaList) { fauna ->
            // Para cada elemento de fauna en la lista, muestra una tarjeta FaunaCard
            FaunaCard(
                fauna = fauna,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun FaunaCard(fauna: Fauna, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            // Muestra la imagen de la fauna
            Image(
                painter = painterResource(fauna.imageResourceId),
                contentDescription = stringResource(fauna.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            // Muestra el título de la fauna
            Text(
                text = stringResource(fauna.stringTitulo),
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center
            )
            // Muestra la descripción de la fauna
            Text(
                text = stringResource(fauna.stringDescripcionId),
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Preview
@Composable
private fun FaunaCardPreview() {
    // Vista previa de una tarjeta de fauna
    FaunaCard(Fauna(R.string.titulo1, R.string.fauna1Descripcion, R.string.fauna1, R.drawable.image1))
}



