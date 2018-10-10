package com.rodrigomoral.kotlinmvvm.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rodrigomoral.kotlinmvvm.default

class MainViewModel : ViewModel() {

    val title = ObservableField<String>("This is the title")
    val count = MutableLiveData<Int>().default(0)

    fun increaseCount() {
        count.value = count.value?.plus(1)
    }
}
