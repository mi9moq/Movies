package com.mironov.movies.domain.repository

import com.mironov.movies.domain.entity.Movie

interface MovieRepository {

    suspend fun getTop(): List<Movie>
}