package com.mironov.movies.data.remote.models

import com.google.gson.annotations.SerializedName

data class MovieDto(
    @SerializedName("kinopoiskId") val id: Int,
    @SerializedName("nameRu") val name: String?,
    val nameOriginal: String?,
    val genres: List<Genre>,
    val year: Int,
    val posterUrl: String
)