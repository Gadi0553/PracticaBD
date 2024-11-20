package com.example.practica1.Data

import androidx.room.Database
import androidx.room.RoomDatabase

class AppDatabase {

    @Database(entities = [Gym::class], version = 1)
    abstract class AppDataBase : RoomDatabase() {

        abstract fun gymDao() : GymDao


    }
}