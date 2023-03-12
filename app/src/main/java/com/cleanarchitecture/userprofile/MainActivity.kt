package com.cleanarchitecture.userprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.cleanarchitecture.userprofile.data.repository.UserRepositoryImpl
import com.cleanarchitecture.userprofile.data.repository.UsersApiImpl
import com.cleanarchitecture.userprofile.domain.usecase.GetUsers
import com.cleanarchitecture.userprofile.presentation.user_list.UserViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = UserViewModel(getUsersUseCase = GetUsers(userRepository = UserRepositoryImpl(dataSource = UsersApiImpl())))

        vm.getTodos()
        vm.users.observe(this, Observer {
            Log.d("Users Data","Size:::::::"+it.size+"Name:::::"+it.get(0).name)

        })
    }

}