package com.ds.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class KotlinApplication

fun main(args: Array<String>) {
	runApplication<KotlinApplication>(*args)
}
