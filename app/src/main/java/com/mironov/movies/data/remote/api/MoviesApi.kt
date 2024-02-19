package com.mironov.movies.data.remote.api

import com.mironov.movies.data.remote.models.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {

    @GET("/api/v2.2/films/collections")
    suspend fun getTop(
        @Query("type") type: String = "TOP_250_MOVIES",
        @Query("page") page: Int = 1
    ): MoviesResponse

}