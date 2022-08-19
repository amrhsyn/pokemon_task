package me.ahch.justdicetask.pokemon.domain.usecase

import me.ahch.justdicetask.pokemon.domain.model.Pokemon
import me.ahch.justdicetask.pokemon.domain.model.PokemonsCount
import me.ahch.justdicetask.pokemon.domain.repository.PokemonsRepository
import javax.inject.Inject

class GetPokemonUseCase @Inject constructor(
    private val repository: PokemonsRepository
) {
    suspend operator fun invoke(id: Int): Result<Pokemon> =
        repository.getPokemon(id)
}
