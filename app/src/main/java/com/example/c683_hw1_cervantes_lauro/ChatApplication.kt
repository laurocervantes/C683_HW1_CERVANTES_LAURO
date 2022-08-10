package com.example.c683_hw1_cervantes_lauro

import android.app.Application
import com.example.c683_hw1_cervantes_lauro.data.WordRoomDatabase
import com.example.c683_hw1_cervantes_lauro.repository.WordRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class ChatApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
    val database by lazy { WordRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}