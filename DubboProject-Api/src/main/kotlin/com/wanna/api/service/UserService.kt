package com.wanna.api.service

import com.wanna.api.entity.User

interface UserService {
    fun getUserById(id: Int) : User
}