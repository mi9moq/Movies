package com.mironov.movies.data.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovieDto(
    @SerialName("kinopoiskId") val id: Int,
    @SerialName("nameRu") val name: String?,
    val nameOriginal: String?,
    val genres: List<Genre>,
    val year: Int,
    val posterUrl: String
)