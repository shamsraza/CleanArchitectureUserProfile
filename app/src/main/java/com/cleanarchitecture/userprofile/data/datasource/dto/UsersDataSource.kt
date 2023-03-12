package com.cleanarchitecture.userprofile.data.datasource.dto

import com.cleanarchitecture.userprofile.domain.model.User

interface UsersDataSource
{
    suspend fun getUsers():List<User>
}