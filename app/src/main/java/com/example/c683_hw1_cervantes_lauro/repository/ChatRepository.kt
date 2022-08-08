package com.example.c683_hw1_cervantes_lauro.repository

import androidx.annotation.WorkerThread
import com.example.c683_hw1_cervantes_lauro.data.Chat
import com.example.c683_hw1_cervantes_lauro.data.ChatDao
import kotlinx.coroutines.flow.Flow

class ChatRepository(private val chatDao: ChatDao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allWords: Flow<List<Chat>> = chatDao.getAlphabetizedWords()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(message: Chat) {
        chatDao.insert(message)
    }
}