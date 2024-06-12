package com.mironov.movies.domain.entity

import com.mironov.movies.data.network.models.Genre

data class Movie(
    val id: Int,
    val name: String,
    val genres: List<Genre>,
    val year: Int,
    val posterUrl: String
)
