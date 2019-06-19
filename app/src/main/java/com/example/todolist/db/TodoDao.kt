package com.example.todolist.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.todolist.models.Todo

@Dao
interface TodoDao {
    @Query("SELECT * FROM todo ORDER BY time DESC")
    fun getAll(): LiveData<List<Todo>>

    @Insert
    suspend fun insert(todo: Todo)

    @Delete
    suspend fun delete(todo: Todo)

    @Update
    suspend fun update(todo: Todo)
}