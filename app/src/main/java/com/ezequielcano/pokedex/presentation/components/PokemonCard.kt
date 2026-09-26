package com.ezequielcano.pokedex.presentation.components

import androidx.benchmark.traceprocessor.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ezequielcano.pokedex.R
import com.ezequielcano.pokedex.ui.theme.getPokemonTypeColor


@Composable
fun PokemonCard(
    idPokemon: String,
    pokemonName: String,
    imagePokemon: String,
    typeName: String,
){
    //Obtenemos el color base del type
    val baseColor = getPokemonTypeColor(typeName)
    //Creamos un color suave para el fondo de la tarjeta
    val cardBackgroundColor = baseColor.copy(alpha = 0.55f)
    //Contenedor principal
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(120.dp),
        //Border redondeados
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = cardBackgroundColor //Aplicamos el color suave
        )
    ) {

        Row(
            modifier = Modifier,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(start = 8.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    text = pokemonName,
                    style = MaterialTheme.typography.labelMedium,
                    fontSize = 15.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Light
                )
                //Funcion TypeBadge
                TypeBadge(typeName = typeName)
            }

            // Más adelante usaremos Coil para descargar la imagen de internet
            Image(
                painter = painterResource(id = R.drawable.pickashu), // Reemplazá 'pikachu' por el nombre exacto de tu archivo en drawable
                contentDescription = pokemonName,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(12.dp))
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PokemonCardPreview(){
    PokemonCard(
        idPokemon = "#0001",
        pokemonName = "Pikachu",
        imagePokemon = "Pikachu",
        typeName = "Electric",
    )
}