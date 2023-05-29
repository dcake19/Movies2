package com.example.movies2.di

import com.example.movie_domain.MoviesRepository
import com.example.movies_data.ApiKeyProviderImpl
import com.example.movies_data.MoviesApi
import com.example.movies_data.MoviesMapperImpl
import com.example.movies_data.MoviesRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataModule {

    @Singleton
    @Provides
    fun provideMoviesRepository(moviesApi: MoviesApi): MoviesRepository {
        return MoviesRepositoryImpl(ApiKeyProviderImpl(),moviesApi,MoviesMapperImpl())
    }
}