package com.mironov.movies.data.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MoviesResponse(
    @SerialName("items") val movies: List<MovieDto>
)
