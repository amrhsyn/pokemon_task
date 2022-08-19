package me.ahch.justdicetask.features.pokemon.domain.repository

import me.ahch.justdicetask.features.pokemon.domain.model.Pokemon
import me.ahch.justdicetask.pokemon.domain.model.PokemonsCount

interface PokemonsRepository {

    suspend fun getPokemonsCount(): Result<PokemonsCount>
    suspend fun getPokemon(id: Int): Result<Pokemon>

}