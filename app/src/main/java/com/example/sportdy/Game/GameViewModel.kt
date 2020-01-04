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
        Log.i("GameViewModel", "Game View Model Created")
        _index.value = 0
        _record.value = false
    }

    fun onSwipe(index: Int) {
        _index.value = index
        _record.value = false
    }

    fun onRecord(index: Int) {
        _index.value = index
        _record.value = false
    }

    fun onFlush():Int? {
        _record.value = true
        return _index.value
    }

}