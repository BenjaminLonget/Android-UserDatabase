package com.example.roomdb_simple.databasepackage

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.roomdb_simple.model.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun getData(): LiveData<List<User>>

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteEntry(user: User)

    @Query("DELETE FROM user_table")
    suspend fun deleteAll()
}