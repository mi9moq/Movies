package com.mironov.movies.data.remote.models

import com.google.gson.annotations.SerializedName

data class Genre (
     @SerializedName("genre") val name: String
)