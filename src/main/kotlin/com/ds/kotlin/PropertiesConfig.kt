package com.ds.kotlin

import org.springframework.boot.context.properties.ConfigurationProperties

//@ConfigurationProperties(prefix = "kotlin")
class PropertiesConfig(
        var personName : String,
        var personAge: Int
)