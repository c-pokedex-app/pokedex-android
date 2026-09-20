package com.ezequielcano.pokedex.core.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
//Esta funcion es la que controlla la navegacion de pantallas.
fun PokedexNavGraph(navController: NavHostController){
    //Contenedor de las rutas
    NavHost(
        //Que controlador va usar
        navController = navController,
        //Cual es la primer ruta que debe mostrar
        startDestination = Screen.Splash.route
    ){
        //aca definimos que se dibuja en cada ruta
        composable(Screen.Splash.route){
            Text(
                text = "Pantalla Splash"
            )
        }
        composable(Screen.Home.route){
            Text(
                text = "Pantalla Home"
            )
        }
    }
}