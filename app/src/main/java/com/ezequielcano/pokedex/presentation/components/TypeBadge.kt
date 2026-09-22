package com.ezequielcano.pokedex.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ezequielcano.pokedex.ui.theme.getPokemonTypeColor

@Composable
//Componente que va a mostrar o destacar el tipo de los pokemones
fun TypeBadge(
    //Nombre del pokemon
    typeName: String,
    modifier: Modifier = Modifier
){

    //Llamamos a la funcion y guardamos el color del resultado en una variable
    val typeColor = getPokemonTypeColor(typeName)

    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp), //Esquina redondeada
        color = typeColor //Color dinamico segun el tipo de Pokemon
    ) {
        Text(
            text = typeName,
            color = Color.White,
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .padding(vertical = 4.dp),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview
@Composable
fun typeBardgePreview(){
    TypeBadge(
        typeName = "Electric",
    )
}