package com.ds.kotlin.http

import com.ds.kotlin.entity.User
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(url= "https://jsonplaceholder.typicode.com", serviceId = "USER-SERVICE")
interface UserClient {

    @RequestMapping(method = [RequestMethod.GET], value = ["/users"],
            consumes = [MediaType.APPLICATION_JSON_VALUE],
            produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getClients(): User
}