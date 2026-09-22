package com.ezequielcano.pokedex.ui.theme

import androidx.compose.ui.graphics.Color

//Color para hacer TESTS:
val Test = Color(0xFFFF0000)

//Colores de la aplicacion
val PokedexRed = Color(0xFFE3350D)
val PokedexRedDark = Color(0xFFB82A09)
val SurfaceLight = Color(0xFFF7F7F7)
val SurfaceDark = Color(0xFF121212)

//Colores por tipo de pokemon
val FireColor = Color(0xFFFF4422)
val WaterColor = Color(0xFF3399FF)
val GrassColor = Color(0xFF77CC55)
val ElectricColor = Color(0xFFFFCC33)
val PsychicColor = Color(0xFFFF5599)
val PoisonColor = Color(0xFFAA5599)
val BugColor = Color(0xFFAABB22)
val NormalColor = Color(0xFFAAAA99)
val RockColor = Color(0xFFBBAA66)
val DragonColor = Color(0xFF7766EE)
val GhostColor = Color(0xFF6666BB)
val IceColor = Color(0xFF77DDFF)
val DefaultTypeColor = Color(0xFF777777) // Por si viene un tipo desconocido


//Funcion para obtener el color segun el texto del tipo
fun getPokemonTypeColor(type: String): Color{
    return when(type.lowercase()){
        //Tipo fuego
        "fire" -> FireColor
        //Tipo fuego
        "water" -> WaterColor
        //Tipo planta
        "grass" -> GrassColor
        //Tipo electrico
        "electric" -> ElectricColor
        //Tipo psiquico
        "phychic" -> PsychicColor
        //Tipo veneno
        "Poison" -> PoisonColor
        //Tipo bicho
        "bug" -> BugColor
        //Tipo normal
        "normal" -> NormalColor
        //Tipo roca
        "rock", "ground" -> RockColor
        //Tipo Dragon
        "dragon" -> DragonColor
        //Tipo fantasma
        "ghost" -> GhostColor
        //Tipo hielo
        "ice" -> IceColor
        //Tipo desconocido
        else -> DefaultTypeColor
    }
}