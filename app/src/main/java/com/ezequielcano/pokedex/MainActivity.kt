package com.ezequielcano.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.ezequielcano.pokedex.core.navigation.PokedexNavGraph
import com.ezequielcano.pokedex.ui.theme.PokedexProyectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokedexProyectTheme {
                //Creo el objeto para controlar la navegacion
                val navController = rememberNavController()
                //Llamamos a nuestro graph de navegacion pasando el identificador(la pantalla)
                PokedexNavGraph(navController = navController)
            }
        }
    }
}

