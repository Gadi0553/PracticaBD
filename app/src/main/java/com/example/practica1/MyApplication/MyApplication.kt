package com.example.practica1.MyApplication

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.example.practica1.Data.AppDatabase

class MyApplication : Application() {
    companion object {
        lateinit var database : AppDatabase.AppDataBase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext!!,
            AppDatabase.AppDataBase::class.java, "gym-db"
        ).build()
    }
}