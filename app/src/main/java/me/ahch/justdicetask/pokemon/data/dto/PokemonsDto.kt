package me.ahch.justdicetask.pokemon.data.dto


import com.google.gson.annotations.SerializedName

data class PokemonsDto(
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("next")
    val next: String? = null,
    @SerializedName("previous")
    val previous: Any? = null,
    @SerializedName("results")
    val results: List<Result?>? = null
) {
    internal data class Result(
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("url")
        val url: String? = null
    )
}