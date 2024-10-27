package com.example.taskmanagerapp.db
import androidx.room.*;

@Parlize
@Entity(tableName ="task_table")
data class Task(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String
)
