package com.example.movie_domain

interface MoviesRepository {
    suspend fun getNowShowing(): List<MovieEntity>
}