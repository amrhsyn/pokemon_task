package me.ahch.justdicetask.pokemon.data.dto


import com.google.gson.annotations.SerializedName

data class PokemonDto(
    @SerializedName("abilities")
    val abilities: List<Ability?>? = null,
    @SerializedName("base_experience")
    val baseExperience: Int? = null,
    @SerializedName("forms")
    val forms: List<Form?>? = null,
    @SerializedName("game_indices")
    val gameIndices: List<GameIndice?>? = null,
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("held_items")
    val heldItems: List<Any?>? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("is_default")
    val isDefault: Boolean? = null,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String? = null,
    @SerializedName("moves")
    val moves: List<Move?>? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("order")
    val order: Int? = null,
    @SerializedName("past_types")
    val pastTypes: List<Any?>? = null,
    @SerializedName("species")
    val species: Species? = null,
    @SerializedName("sprites")
    val sprites: Sprites? = null,
    @SerializedName("stats")
    val stats: List<Stat?>? = null,
    @SerializedName("types")
    val types: List<Type?>? = null,
    @SerializedName("weight")
    val weight: Int? = null
) {
    data class Ability(
        @SerializedName("ability")
        val ability: Ability? = null,
        @SerializedName("is_hidden")
        val isHidden: Boolean? = null,
        @SerializedName("slot")
        val slot: Int? = null
    ) {
         data class Ability(
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("url")
            val url: String? = null
        )
    }

     data class Form(
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("url")
        val url: String? = null
    )

     data class GameIndice(
        @SerializedName("game_index")
        val gameIndex: Int? = null,
        @SerializedName("version")
        val version: Version? = null
    ) {
         data class Version(
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("url")
            val url: String? = null
        )
    }

     data class Move(
        @SerializedName("move")
        val move: Move? = null,
        @SerializedName("version_group_details")
        val versionGroupDetails: List<VersionGroupDetail?>? = null
    ) {
         data class Move(
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("url")
            val url: String? = null
        )

         data class VersionGroupDetail(
            @SerializedName("level_learned_at")
            val levelLearnedAt: Int? = null,
            @SerializedName("move_learn_method")
            val moveLearnMethod: MoveLearnMethod? = null,
            @SerializedName("version_group")
            val versionGroup: VersionGroup? = null
        ) {
             data class MoveLearnMethod(
                @SerializedName("name")
                val name: String? = null,
                @SerializedName("url")
                val url: String? = null
            )

             data class VersionGroup(
                @SerializedName("name")
                val name: String? = null,
                @SerializedName("url")
                val url: String? = null
            )
        }
    }

     data class Species(
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("url")
        val url: String? = null
    )

     data class Sprites(
        @SerializedName("back_default")
        val backDefault: String? = null,
        @SerializedName("back_female")
        val backFemale: Any? = null,
        @SerializedName("back_shiny")
        val backShiny: String? = null,
        @SerializedName("back_shiny_female")
        val backShinyFemale: Any? = null,
        @SerializedName("front_default")
        val frontDefault: String? = null,
        @SerializedName("front_female")
        val frontFemale: Any? = null,
        @SerializedName("front_shiny")
        val frontShiny: String? = null,
        @SerializedName("front_shiny_female")
        val frontShinyFemale: Any? = null,
        @SerializedName("other")
        val other: Other? = null,
        @SerializedName("versions")
        val versions: Versions? = null
    ) {
         data class Other(
            @SerializedName("dream_world")
            val dreamWorld: DreamWorld? = null,
            @SerializedName("home")
            val home: Home? = null,
            @SerializedName("official-artwork")
            val officialArtwork: OfficialArtwork? = null
        ) {
             data class DreamWorld(
                @SerializedName("front_default")
                val frontDefault: String? = null,
                @SerializedName("front_female")
                val frontFemale: Any? = null
            )

             data class Home(
                @SerializedName("front_default")
                val frontDefault: String? = null,
                @SerializedName("front_female")
                val frontFemale: Any? = null,
                @SerializedName("front_shiny")
                val frontShiny: String? = null,
                @SerializedName("front_shiny_female")
                val frontShinyFemale: Any? = null
            )

             data class OfficialArtwork(
                @SerializedName("front_default")
                val frontDefault: String? = null
            )
        }

         data class Versions(
            @SerializedName("generation-i")
            val generationI: GenerationI? = null,
            @SerializedName("generation-ii")
            val generationIi: GenerationIi? = null,
            @SerializedName("generation-iii")
            val generationIii: GenerationIii? = null,
            @SerializedName("generation-iv")
            val generationIv: GenerationIv? = null,
            @SerializedName("generation-v")
            val generationV: GenerationV? = null,
            @SerializedName("generation-vi")
            val generationVi: GenerationVi? = null,
            @SerializedName("generation-vii")
            val generationVii: GenerationVii? = null,
            @SerializedName("generation-viii")
            val generationViii: GenerationViii? = null
        ) {
             data class GenerationI(
                @SerializedName("red-blue")
                val redBlue: RedBlue? = null,
                @SerializedName("yellow")
                val yellow: Yellow? = null
            ) {
                 data class RedBlue(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_gray")
                    val backGray: String? = null,
                    @SerializedName("back_transparent")
                    val backTransparent: String? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_gray")
                    val frontGray: String? = null,
                    @SerializedName("front_transparent")
                    val frontTransparent: String? = null
                )

                 data class Yellow(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_gray")
                    val backGray: String? = null,
                    @SerializedName("back_transparent")
                    val backTransparent: String? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_gray")
                    val frontGray: String? = null,
                    @SerializedName("front_transparent")
                    val frontTransparent: String? = null
                )
            }

             data class GenerationIi(
                @SerializedName("crystal")
                val crystal: Crystal? = null,
                @SerializedName("gold")
                val gold: Gold? = null,
                @SerializedName("silver")
                val silver: Silver? = null
            ) {
                 data class Crystal(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("back_shiny_transparent")
                    val backShinyTransparent: String? = null,
                    @SerializedName("back_transparent")
                    val backTransparent: String? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_shiny_transparent")
                    val frontShinyTransparent: String? = null,
                    @SerializedName("front_transparent")
                    val frontTransparent: String? = null
                )

                 data class Gold(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_transparent")
                    val frontTransparent: String? = null
                )

                 data class Silver(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_transparent")
                    val frontTransparent: String? = null
                )
            }

             data class GenerationIii(
                @SerializedName("emerald")
                val emerald: Emerald? = null,
                @SerializedName("firered-leafgreen")
                val fireredLeafgreen: FireredLeafgreen? = null,
                @SerializedName("ruby-sapphire")
                val rubySapphire: RubySapphire? = null
            ) {
                 data class Emerald(
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null
                )

                 data class FireredLeafgreen(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null
                )

                 data class RubySapphire(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null
                )
            }

             data class GenerationIv(
                @SerializedName("diamond-pearl")
                val diamondPearl: DiamondPearl? = null,
                @SerializedName("heartgold-soulsilver")
                val heartgoldSoulsilver: HeartgoldSoulsilver? = null,
                @SerializedName("platinum")
                val platinum: Platinum? = null
            ) {
                 data class DiamondPearl(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_female")
                    val backFemale: Any? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("back_shiny_female")
                    val backShinyFemale: Any? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: Any? = null
                )

                 data class HeartgoldSoulsilver(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_female")
                    val backFemale: Any? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("back_shiny_female")
                    val backShinyFemale: Any? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: Any? = null
                )

                 data class Platinum(
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_female")
                    val backFemale: Any? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("back_shiny_female")
                    val backShinyFemale: Any? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: Any? = null
                )
            }

             data class GenerationV(
                @SerializedName("black-white")
                val blackWhite: BlackWhite? = null
            ) {
                 data class BlackWhite(
                    @SerializedName("animated")
                    val animated: Animated? = null,
                    @SerializedName("back_default")
                    val backDefault: String? = null,
                    @SerializedName("back_female")
                    val backFemale: Any? = null,
                    @SerializedName("back_shiny")
                    val backShiny: String? = null,
                    @SerializedName("back_shiny_female")
                    val backShinyFemale: Any? = null,
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: Any? = null
                ) {
                     data class Animated(
                        @SerializedName("back_default")
                        val backDefault: String? = null,
                        @SerializedName("back_female")
                        val backFemale: Any? = null,
                        @SerializedName("back_shiny")
                        val backShiny: String? = null,
                        @SerializedName("back_shiny_female")
                        val backShinyFemale: Any? = null,
                        @SerializedName("front_default")
                        val frontDefault: String? = null,
                        @SerializedName("front_female")
                        val frontFemale: Any? = null,
                        @SerializedName("front_shiny")
                        val frontShiny: String? = null,
                        @SerializedName("front_shiny_female")
                        val frontShinyFemale: Any? = null
                    )
                }
            }

             data class GenerationVi(
                @SerializedName("omegaruby-alphasapphire")
                val omegarubyAlphasapphire: OmegarubyAlphasapphire? = null,
                @SerializedName("x-y")
                val xY: XY? = null
            ) {
                 data class OmegarubyAlphasapphire(
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: Any? = null
                )

                 data class XY(
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: Any? = null
                )
            }

             data class GenerationVii(
                @SerializedName("icons")
                val icons: Icons? = null,
                @SerializedName("ultra-sun-ultra-moon")
                val ultraSunUltraMoon: UltraSunUltraMoon? = null
            ) {
                 data class Icons(
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null
                )

                 data class UltraSunUltraMoon(
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null,
                    @SerializedName("front_shiny")
                    val frontShiny: String? = null,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: Any? = null
                )
            }

             data class GenerationViii(
                @SerializedName("icons")
                val icons: Icons? = null
            ) {
                 data class Icons(
                    @SerializedName("front_default")
                    val frontDefault: String? = null,
                    @SerializedName("front_female")
                    val frontFemale: Any? = null
                )
            }
        }
    }

     data class Stat(
        @SerializedName("base_stat")
        val baseStat: Int? = null,
        @SerializedName("effort")
        val effort: Int? = null,
        @SerializedName("stat")
        val stat: Stat? = null
    ) {
         data class Stat(
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("url")
            val url: String? = null
        )
    }

     data class Type(
        @SerializedName("slot")
        val slot: Int? = null,
        @SerializedName("type")
        val type: Type? = null
    ) {
         data class Type(
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("url")
            val url: String? = null
        )
    }
}