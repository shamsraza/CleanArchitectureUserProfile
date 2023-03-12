package com.cleanarchitecture.userprofile.data.repository

import com.cleanarchitecture.userprofile.data.datasource.dto.UsersApi
import com.cleanarchitecture.userprofile.data.datasource.dto.UsersDataSource
import com.cleanarchitecture.userprofile.data.datasource.dto.toUser
import com.cleanarchitecture.userprofile.domain.model.User

class UsersApiImpl:UsersDataSource {
    override suspend fun getUsers(): List<User> {
      return  UsersApi.getInstance().getUsers().map { it.toUser() }
    }
}