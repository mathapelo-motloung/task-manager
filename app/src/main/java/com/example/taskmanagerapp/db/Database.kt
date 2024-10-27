package com.example.taskmanagerapp.db

import.androidx.room.*
import.android.content.Context

abstract class Database: RoomDatabase() {
    abstratct fun taskDao():TaskDAO

    companion object{
        @Volatile
        private var INSTANCE: Database?= null

        fun getDatabase(context:Context):TaskDatabase{
            synchronized(lock:this){
                var instance = INSTANCE
                IF(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TaskDatabase::class.java,
                        name: "task_database"
                    ).fallbackToDestructiveMigration().build
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}