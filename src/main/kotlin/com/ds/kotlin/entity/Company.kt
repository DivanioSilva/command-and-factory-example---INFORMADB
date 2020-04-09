package com.ds.kotlin.entity


import com.fasterxml.jackson.annotation.JsonProperty

data class Company(
    @JsonProperty("bs")
    val bs: String = "",
    @JsonProperty("catchPhrase")
    val catchPhrase: String = "",
    @JsonProperty("name")
    val name: String = ""
)