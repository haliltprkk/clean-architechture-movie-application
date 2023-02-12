package com.haliltprkk.movieapplication.data.remote
import com.google.gson.annotations.SerializedName

data class ProductionCountryDto(
    @SerializedName("iso_3166_1")
    val iso31661: String,
    val name: String
)
