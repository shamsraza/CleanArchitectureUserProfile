package com.cleanarchitecture.userprofile.presentation.user_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cleanarchitecture.userprofile.domain.model.User
import com.cleanarchitecture.userprofile.domain.usecase.GetUsers
import kotlinx.coroutines.launch

class UserViewModel constructor(private val getUsersUseCase: GetUsers) : BaseViewModel() {
    private val _users = MutableLiveData<List<User>>()

    val users: LiveData<List<User>>
        get() = _users


     fun getTodos() {
        coroutineScope.launch {
            _users.postValue(getUsersUseCase())
        }
    }
}