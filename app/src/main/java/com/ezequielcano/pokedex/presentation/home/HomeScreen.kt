package com.ezequielcano.pokedex.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ezequielcano.pokedex.R
import com.ezequielcano.pokedex.presentation.components.PokemonCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_back),
                            contentDescription = "Back Button"
                        )
                    }
                },

                // Icono de opciones
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_options),
                            contentDescription = "Option Button"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            // Pokebola decorativa de fondo
            Image(
                painter = painterResource(R.drawable.ic_pokebola),
                contentDescription = null,
                modifier = Modifier
                    .size(180.dp)
                    .align(Alignment.TopEnd)
                    .offset(x = 40.dp, y = -18.dp)
                    .alpha(0.10f)
            )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(
                    modifier = Modifier.height(22.dp)
                )
                Text(
                    text = "Pokedex",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.ExtraBold
                )

                Spacer(
                    modifier = Modifier.height(22.dp)
                )

                // Permite mostrar elementos de forma cuadriculada
                LazyVerticalGrid(
                    // Dos columnas verticales
                    columns = GridCells.Fixed(2),
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    item {
                        PokemonCard(
                            idPokemon = "001",
                            pokemonName = "Pikachu",
                            imagePokemon = "Pikachu",
                            typeName = "Grass"
                        )
                    }

                    item {
                        PokemonCard(
                            idPokemon = "001",
                            pokemonName = "Pikachu",
                            imagePokemon = "Pikachu",
                            typeName = "Fire"
                        )
                    }

                    item {
                        PokemonCard(
                            idPokemon = "001",
                            pokemonName = "Pikachu",
                            imagePokemon = "Pikachu",
                            typeName = "Water"
                        )
                    }

                    item {
                        PokemonCard(
                            idPokemon = "001",
                            pokemonName = "Pikachu",
                            imagePokemon = "Pikachu",
                            typeName = "Electric"
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(onBack())
}