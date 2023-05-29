package com.example.movies_data

import com.example.movie_domain.MovieEntity
import com.example.movie_domain.MoviesRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope

class MoviesRepositoryImpl(
    private val apiKeyProvider: ApiKeyProvider,
    private val api: MoviesApi,
    private val mapper: MoviesMapper
    ): MoviesRepository {

    override suspend fun getNowShowing(): List<MovieEntity> {
        return coroutineScope {
            mapper.map(api.getNowPlaying(apiKeyProvider.getApiKey(), 1))
        }
    }
}