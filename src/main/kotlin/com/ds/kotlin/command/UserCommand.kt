package com.ds.kotlin.command

import com.ds.kotlin.entity.User

@FunctionalInterface
interface UserCommand {
    fun getUsers(): User
}