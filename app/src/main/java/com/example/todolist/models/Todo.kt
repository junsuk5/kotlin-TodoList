package com.example.todolist.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    var todo: String,
    var time: Long
) {
    @PrimaryKey(autoGenerate = true)
    var uid: Int? = null
}