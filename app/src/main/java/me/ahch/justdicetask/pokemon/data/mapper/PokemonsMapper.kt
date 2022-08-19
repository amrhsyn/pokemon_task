package me.ahch.justdicetask.pokemon.data.mapper

import me.ahch.justdicetask.pokemon.data.dto.PokemonDto
import me.ahch.justdicetask.pokemon.data.dto.PokemonsDto
import me.ahch.justdicetask.pokemon.domain.model.Pokemon
import me.ahch.justdicetask.pokemon.domain.model.PokemonsCount


fun PokemonsDto.toPokemonCount(): PokemonsCount {
    return PokemonsCount(this.count)
}

fun PokemonDto.toPokemon(): Pokemon {
    return Pokemon(name = this.name, imageUrl = this.sprites?.frontDefault)
}
