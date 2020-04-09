package com.ds.kotlin.service

import com.ds.kotlin.entity.Person

interface PersonService {

    fun save(person: Person): Person

    fun update(person: Person): Person

    fun delete(person: Person)

    fun findById(personId: Long): Person

    fun findByName(personName: String): Person

    fun findAll(): List<Person>
}