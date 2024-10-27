package com.example.taskmanagerapp.db

import.androidx.lifecysle.LiveData
import.androidx.room.*

@Dao
interface TaskDAO {
    @Insert
    suspend fun insert(task:Task)
    @Delete
    suspend fun update(task:Task)
    @Update
    suspend fun delete(task:Task)
    @Query(value: "Delete from task_table")
    suspend fun deleteAllTasks(task:Task)
    @Query(value: "Select * from task_table")
    fun getAllTasks(task:Task)
}