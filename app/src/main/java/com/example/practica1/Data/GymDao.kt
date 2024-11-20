package com.example.practica1.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface GymDao {

    @Query("SELECT * FROM gym")
        fun getAll() : LiveData<List<Gym>>

        @Query("SELECT * FROM gym WHERE id= :gymId")
        suspend fun getById(gymId: Int): Gym

    @Insert
    suspend fun insert(gym: Gym)

    @Delete
    suspend fun delete(gym: Gym)

    @Update
    suspend fun update(gym: Gym)
}

