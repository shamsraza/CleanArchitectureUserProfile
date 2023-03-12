package com.cleanarchitecture.userprofile.domain.usecase

import androidx.lifecycle.LiveData
import com.cleanarchitecture.userprofile.domain.model.User
import com.cleanarchitecture.userprofile.domain.repository.UserRepository

class GetUsers(private val userRepository: UserRepository) {
    suspend operator fun invoke(): List<User>? {
        return userRepository.getUsers()
    }
}