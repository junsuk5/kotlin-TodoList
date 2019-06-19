package com.example.todolist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.todolist.db.AppDatabase
import com.example.todolist.models.Todo

class MainViewModel(application: Application) : AndroidViewModel(application) {
    val db = Room.databaseBuilder(
        application,
        AppDatabase::class.java, "database-name"
    ).build()

    fun getAll(): LiveData<List<Todo>> {
        return db.todoDao().getAll()
    }
}