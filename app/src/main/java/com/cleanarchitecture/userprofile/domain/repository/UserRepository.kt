package com.cleanarchitecture.userprofile.domain.repository

import com.cleanarchitecture.userprofile.domain.model.User

interface UserRepository {
    suspend fun getUsers():List<User>
}