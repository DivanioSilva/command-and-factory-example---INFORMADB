package com.ds.kotlin.controller

import com.ds.kotlin.PropertiesConfig
import com.ds.kotlin.entity.Person
import com.ds.kotlin.service.PersonService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class PersonController(val personService: PersonService /*, val properties: PropertiesConfig*/) {

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

    @GetMapping("findAll", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findAllPersons(): List<Person>{
        return this.personService.findAll()
    }
}