package com.mironov.movies.data.datasource

import com.mironov.movies.data.network.models.MovieDto

interface MoviesRemoteDataSource {

    suspend fun getTop(): List<MovieDto>
}