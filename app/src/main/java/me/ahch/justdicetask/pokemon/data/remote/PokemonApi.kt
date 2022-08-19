package me.ahch.justdicetask.pokemon.data.remote

import me.ahch.justdicetask.pokemon.data.dto.PokemonDto
import me.ahch.justdicetask.pokemon.data.dto.PokemonsDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("/v2/pokemon/")
    suspend fun getPokemonsCount(): Response<PokemonsDto>

    @GET("/v2/pokemon/{id}")
    suspend fun getPokemon(
        @Path("id") id: Int,
    ): Response<PokemonDto>

}