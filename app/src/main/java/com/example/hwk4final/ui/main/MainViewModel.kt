package com.example.hwk4final.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var firstNum = ""

    private var secondNum = ""

    private var result : MutableLiveData<Int> = MutableLiveData()

    fun multiply(first: String, second: String) {

        firstNum = first
        secondNum = second

        result.value = first.toInt() * second.toInt()
    }

    fun getResult(): MutableLiveData<Int> {
        return result
    }
}