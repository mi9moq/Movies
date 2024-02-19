package com.mironov.movies.data.remote.models

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("items") val movies: List<MovieDto>
)
