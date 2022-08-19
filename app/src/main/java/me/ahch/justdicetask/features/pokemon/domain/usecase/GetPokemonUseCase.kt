package me.ahch.justdicetask.features.pokemon.domain.usecase

import me.ahch.justdicetask.features.pokemon.domain.model.Pokemon
import me.ahch.justdicetask.features.pokemon.domain.repository.PokemonsRepository
import javax.inject.Inject

class GetPokemonUseCase @Inject constructor(
    private val repository: PokemonsRepository
) {
    suspend operator fun invoke(id: Int): Result<Pokemon> =
        repository.getPokemon(id)
}
