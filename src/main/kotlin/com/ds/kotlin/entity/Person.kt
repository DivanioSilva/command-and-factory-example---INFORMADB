package com.ds.kotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Person(@Id
             @GeneratedValue(strategy = GenerationType.IDENTITY)
             val id: Long, val name: String)