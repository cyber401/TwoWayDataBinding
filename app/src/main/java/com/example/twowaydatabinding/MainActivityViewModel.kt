package com.example.twowaydatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var mutableString = MutableLiveData<String>()
    init{
        mutableString.value = "Lalit"
    }

}