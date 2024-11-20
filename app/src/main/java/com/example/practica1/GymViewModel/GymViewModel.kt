package com.example.practica1.GymViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practica1.Data.Gym
import com.example.practica1.Data.GymDao
import com.example.practica1.MyApplication.MyApplication
import kotlinx.coroutines.launch

class GymViewModel: ViewModel() {

    private val gymDao: GymDao = MyApplication.database.gymDao()
    val _currenGym : MutableLiveData<Gym> = MutableLiveData()
    val currentGym : LiveData<Gym> = _currenGym

    fun insert(gym: Gym) {
        viewModelScope.launch {
            gymDao.insert(gym)
        }
    }

    fun findGym(id : Int) {
        viewModelScope.launch {
            var user = gymDao.getById(id)
            _currenGym.postValue(user)
        }
    }
}