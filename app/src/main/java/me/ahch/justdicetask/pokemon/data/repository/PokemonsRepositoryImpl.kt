package me.ahch.justdicetask.pokemon.data.repository

import me.ahch.justdicetask.pokemon.data.mapper.toPokemon
import me.ahch.justdicetask.pokemon.data.mapper.toPokemonCount
import me.ahch.justdicetask.pokemon.data.remote.PokemonApi
import me.ahch.justdicetask.pokemon.domain.model.Pokemon
import me.ahch.justdicetask.pokemon.domain.model.PokemonsCount
import me.ahch.justdicetask.pokemon.domain.repository.PokemonsRepository

class PokemonsRepositoryImpl(private val api: PokemonApi) : PokemonsRepository {

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