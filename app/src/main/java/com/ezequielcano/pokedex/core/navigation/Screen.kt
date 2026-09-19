package com.ezequielcano.pokedex.core.navigation

//El indice de todas las pantallas
sealed class Screen(val route: String){
    object Splash: Screen("splash")
    object Login: Screen("login")
    object Register: Screen("register")
    object Home: Screen("home")
    object Detail: Screen("detail")
    object Favorites: Screen("favorites")
    object Profile: Screen("profile")
}