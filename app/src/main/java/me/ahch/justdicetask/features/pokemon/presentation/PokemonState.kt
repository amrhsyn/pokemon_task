package me.ahch.justdicetask.features.pokemon.presentation

import me.ahch.justdicetask.features.pokemon.domain.model.Pokemon

data class PokemonState(
    val pokemonCount: Int? = null,
    var currentPokemon: Pokemon? = null
)