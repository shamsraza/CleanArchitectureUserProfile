package com.cleanarchitecture.userprofile.data.repository

import com.cleanarchitecture.userprofile.data.datasource.dto.UsersDataSource
import com.cleanarchitecture.userprofile.domain.model.User
import com.cleanarchitecture.userprofile.domain.repository.UserRepository

class UserRepositoryImpl(private val dataSource: UsersDataSource):UserRepository {
    override suspend fun getUsers(): List<User> {
       return dataSource.getUsers()
    }
}