package com.example.todolist.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.todolist.models.Todo

@Dao
interface TodoDao {
    @Query("SELECT * FROM todo ORDER BY time DESC")
    fun getAll(): LiveData<List<Todo>>

    @Insert
    fun insert(todo: Todo)

    @Delete
    fun delete(todo: Todo)

    @Update
    fun update(todo: Todo)
}