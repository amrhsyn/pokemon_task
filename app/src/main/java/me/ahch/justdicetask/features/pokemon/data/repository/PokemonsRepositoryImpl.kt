package me.ahch.justdicetask.features.pokemon.data.repository

import me.ahch.justdicetask.features.pokemon.data.mapper.toPokemon
import me.ahch.justdicetask.features.pokemon.data.mapper.toPokemonCount
import me.ahch.justdicetask.features.pokemon.data.remote.PokemonApi
import me.ahch.justdicetask.features.pokemon.domain.model.Pokemon
import me.ahch.justdicetask.pokemon.domain.model.PokemonsCount
import me.ahch.justdicetask.features.pokemon.domain.repository.PokemonsRepository
import javax.inject.Inject

class PokemonsRepositoryImpl @Inject constructor(private val api: PokemonApi) : PokemonsRepository {

    override suspend fun getPokemonsCount(): Result<PokemonsCount> {
        val result = api.getPokemonsCount()
        return if (result.isSuccessful) {
            Result.success(result.body()!!.toPokemonCount())
        } else {
            Result.failure(Throwable(result.errorBody().toString()))
        }
    }

    override suspend fun getPokemon(id: Int): Result<Pokemon> {
        val result = api.getPokemon(id)
        return if (result.isSuccessful) {
            Result.success(result.body()!!.toPokemon())
        } else {
            Result.failure(Throwable(result.errorBody().toString()))
        }
    }

}