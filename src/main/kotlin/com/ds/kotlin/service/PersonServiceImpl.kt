package com.ds.kotlin.service

import com.ds.kotlin.entity.Person
import com.ds.kotlin.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl(val personRepository: PersonRepository): PersonService {
    override fun save(person: Person): Person {
        return this.personRepository.save(person);
    }

    override fun update(person: Person): Person {
        return personRepository.save(person)
    }

    override fun delete(person: Person) {
        this.personRepository.delete(person)
    }

    override fun findById(personId: Long): Person {
        return this.personRepository.findById(personId).orElse(null)
    }

    override fun findByName(personName: String): Person {
        return this.personRepository.findByName(personName)
    }

    override fun findAll(): List<Person> {
        return this.personRepository.findAll()
    }
}