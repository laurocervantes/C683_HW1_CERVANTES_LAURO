package com.example.c683_hw1_cervantes_lauro.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ChatDao {

    @Query("SELECT * FROM chat_table ORDER BY message ASC")
    fun getAlphabetizedWords(): Flow<List<Chat>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(message: Chat)

    @Query("DELETE FROM chat_table")
    suspend fun deleteAll()

}