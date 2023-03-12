package com.cleanarchitecture.userprofile.data.datasource.dto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UsersApi {
    @GET("/users")
    suspend fun getUsers(): List<UsersDTO>

    companion object {
        var usersApi: UsersApi? = null
        fun getInstance(): UsersApi {
            if (usersApi == null) {
                usersApi = Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(UsersApi::class.java)
            }
            return usersApi!!
        }
    }
}