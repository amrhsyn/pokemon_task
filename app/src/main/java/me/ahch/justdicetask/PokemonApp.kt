package me.ahch.justdicetask

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.ahch.justdicetask.navigation.Route
import me.ahch.justdicetask.features.pokemon.presentation.PokemonScreen
import me.ahch.justdicetask.ui.theme.JustdiceTaskTheme

@Composable
fun PokemonApp() {

    JustdiceTaskTheme {

        val navController = rememberNavController()
        val scaffoldState = rememberScaffoldState()

        Scaffold(
            modifier = Modifier.fillMaxSize(),
            scaffoldState = scaffoldState,
        ) {
            NavHost(
                navController = navController,
                startDestination = Route.POKEMON_SCREEN
            ) {
                composable(
                    route = Route.POKEMON_SCREEN
                ) {
                    PokemonScreen(
                        scaffoldState = scaffoldState,
                        viewModel = hiltViewModel(),
                    )

                }

            }
        }
    }
}