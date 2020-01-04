package com.example.sportdy.Game

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {

    private val _index = MutableLiveData<Int>()
    val index: LiveData<Int> get() = _index

    private val _record = MutableLiveData<Boolean>()
    val record: LiveData<Boolean> get() = _record

    init {
        _index.value = 0
        _record.value = false
        Log.i("GameViewModel", "Game View Model Created ${_index.value.toString() + ' ' + _record.value }")
    }

    fun onSwipe(index: Int) {
        _index.value = index
        _record.value = false
        Log.i("GameViewModel", "Game View Model Swipe ${_index.value.toString() + ' ' + _record.value }")
    }

    fun onRecord() {
        _record.value = true
        Log.i("GameViewModel", "Game View Model Record ${_index.value.toString() + ' ' + _record.value }")
    }

    fun onFlush():Int {
        _record.value = false
        return _index.value!!
        Log.i("GameViewModel", "Game View Model Flush ${_index.value.toString() + ' ' + _record.value }")
    }

}