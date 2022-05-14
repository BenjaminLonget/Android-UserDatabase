package com.example.roomdb_simple.repository

import androidx.lifecycle.LiveData
import com.example.roomdb_simple.databasepackage.UserDao
import com.example.roomdb_simple.model.User

class UserRepo(private val userDao: UserDao) {
    val readAllData: LiveData<List<User>> = userDao.getData()

    suspend fun addUser(user: User){
        userDao.addUser(user)   //køre funktionen fra DAO, køres selv af den i viewmodel
    }

    suspend fun updateUser(user: User){
        userDao.updateUser(user)
    }
    suspend fun deleteEntry(user: User){
        userDao.deleteEntry(user)
    }

    suspend fun deleteAll(){
        userDao.deleteAll()
    }
}