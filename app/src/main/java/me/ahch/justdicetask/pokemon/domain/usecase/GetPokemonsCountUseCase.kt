package me.ahch.justdicetask.pokemon.domain.usecase

import me.ahch.justdicetask.pokemon.domain.model.PokemonsCount
import me.ahch.justdicetask.pokemon.domain.repository.PokemonsRepository
import javax.inject.Inject

class GetPokemonsCountUseCase @Inject constructor(
    private val repository: PokemonsRepository
) {
    suspend operator fun invoke(): Result<PokemonsCount> =
        repository.getPokemonsCount()
}
