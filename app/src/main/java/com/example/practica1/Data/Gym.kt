package com.example.practica1.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Gym")
class Gym (

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "descripcion")
    val descripcion : String,
)