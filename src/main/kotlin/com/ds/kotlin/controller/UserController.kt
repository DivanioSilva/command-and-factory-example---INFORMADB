package com.ds.kotlin.controller

import com.ds.kotlin.entity.User
import com.ds.kotlin.factory.UserFactory
import com.ds.kotlin.http.UserClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(val userClient: UserClient, val userFactory: UserFactory) {

    /*
    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun savePerson(@RequestBody person: Person): Person{
        return this.personService.save(person)
    }

    @PutMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun updatePerson(@RequestBody person: Person): Person{
        return this.personService.update(person)
    }

    @DeleteMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun deletePerson(@RequestBody person: Person){
        this.personService.delete(person)
    }

    @GetMapping("personId/{personId}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findByPersonById(@PathVariable personId: Long): Person{
        return this.personService.findById(personId)
    }

    @GetMapping("personName{personName}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findByPersonName(@PathVariable personName: String): Person{
        return this.personService.findByName(personName)
    }
    */

    @GetMapping("findAll", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findAllPersons(): User{
        return this.userClient.getClients()
    }
}