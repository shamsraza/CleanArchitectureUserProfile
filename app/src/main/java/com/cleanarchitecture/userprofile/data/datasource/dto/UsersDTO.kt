package com.cleanarchitecture.userprofile.data.datasource.dto

import com.cleanarchitecture.userprofile.domain.model.User

data class UsersDTO(val address: Address,
                    val company: Company,
                    val email: String,
                    val id: Int,
                    val name: String,
                    val phone: String,
                    val username: String,
                    val website: String)

fun UsersDTO.toUser(): User {
    return User(
        id = id,
        name = name,
        username = username,
        email = email
    )
}