package com.example.firstappforlab

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _userList = MutableLiveData<MutableList<User>>(mutableListOf())
    val userList: LiveData<MutableList<User>> get() = _userList

    fun addUser(user: User) {
        _userList.value?.add(user)
    }
}