package me.ahch.justdicetask.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.ahch.justdicetask.BuildConfig
import me.ahch.justdicetask.features.pokemon.data.remote.PokemonApi
import me.ahch.justdicetask.features.pokemon.data.repository.PokemonsRepositoryImpl
import me.ahch.justdicetask.features.pokemon.domain.repository.PokemonsRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokemonModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            )
            .build()
    }

    @Provides
    @Singleton
    fun providePokemonApi(client: OkHttpClient): PokemonApi {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun providePokemonsRepository(
        api: PokemonApi,
    ): PokemonsRepository {
        return PokemonsRepositoryImpl(
            api = api,
        )
    }

}








