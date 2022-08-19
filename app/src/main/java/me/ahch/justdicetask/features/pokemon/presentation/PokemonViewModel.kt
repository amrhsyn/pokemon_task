package me.ahch.justdicetask.features.pokemon.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import me.ahch.justdicetask.features.pokemon.domain.usecase.GetPokemonUseCase
import me.ahch.justdicetask.features.pokemon.domain.usecase.GetPokemonsCountUseCase
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonUseCase: GetPokemonUseCase,
    private val getPokemonsCountUseCase: GetPokemonsCountUseCase
) : ViewModel() {


    private val _state = MutableStateFlow(PokemonState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
              getPokemonsCount()
        }

    }

    fun getPokemonsCount() {
        viewModelScope.launch {
            getPokemonsCountUseCase.invoke().fold(
                onSuccess = {
                    _state.value = state.value.copy(pokemonCount = it.count)
                    getRandomPokemon()
                },
                onFailure = {

                })
        }
    }

    fun getRandomPokemon() {
            val randomId = Random.nextInt(0, 151)
            viewModelScope.launch {
                getPokemonUseCase.invoke(randomId).fold(
                    onSuccess = { pokemon ->
                        _state.value = state.value.copy(currentPokemon = pokemon)
                    },
                    onFailure = {

                    })
            }
    }

}