package com.example.c683_hw1_cervantes_lauro.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "chat_table")
class Chat(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "message") val message: String)