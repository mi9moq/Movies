package com.mironov.movies.data.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Genre (
     @SerialName("genre") val name: String
)