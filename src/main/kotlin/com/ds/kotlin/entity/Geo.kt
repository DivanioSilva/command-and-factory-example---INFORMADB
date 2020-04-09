package com.ds.kotlin.entity


import com.fasterxml.jackson.annotation.JsonProperty

data class Geo(
    @JsonProperty("lat")
    val lat: String = "",
    @JsonProperty("lng")
    val lng: String = ""
)