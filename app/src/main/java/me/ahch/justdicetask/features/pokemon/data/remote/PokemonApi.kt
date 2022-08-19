package me.ahch.justdicetask.features.pokemon.data.remote

import me.ahch.justdicetask.pokemon.data.dto.PokemonDto
import me.ahch.justdicetask.features.pokemon.data.dto.PokemonsDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {

    @GET("v2/pokemon/?limit=151")
    suspend fun getPokemonsCount(): Response<PokemonsDto>

    @GET("v2/pokemon/{id}")
    suspend fun getPokemon(
        @Path("id") id: Int,
    ): Response<PokemonDto>

}