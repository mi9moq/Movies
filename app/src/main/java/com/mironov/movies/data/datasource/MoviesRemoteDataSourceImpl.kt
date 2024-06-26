package com.mironov.movies.data.datasource

import com.mironov.movies.data.network.api.MoviesApi
import com.mironov.movies.data.network.models.MovieDto
import javax.inject.Inject

class MoviesRemoteDataSourceImpl @Inject constructor(
    private val api: MoviesApi
) : MoviesRemoteDataSource {

    override suspend fun getTop(): List<MovieDto> =
        api.getTop().movies
}