package me.ahch.justdicetask.features.pokemon.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun PokemonScreen(scaffoldState: ScaffoldState, viewModel: PokemonViewModel) {


    val state by viewModel.state.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Text("pokemon count: " + state.pokemonCount)
        Spacer(modifier = Modifier.height(16.dp))
        Text("pokemon name: " + state.currentPokemon?.name)
        Spacer(modifier = Modifier.height(16.dp))
        AsyncImage(
            model = state.currentPokemon?.imageUrl,
            contentDescription = state.currentPokemon?.name,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(42.dp))
        Button(onClick = { viewModel.getRandomPokemon() }) {
            Text("next pokemon")
        }
    }


}