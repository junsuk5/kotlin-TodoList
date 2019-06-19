package com.example.todolist.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todolist.models.Todo

@Database(entities = [Todo::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}