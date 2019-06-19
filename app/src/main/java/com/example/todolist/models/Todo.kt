package com.example.todolist.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Todo(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    var todo: String,
    var time: Long
)