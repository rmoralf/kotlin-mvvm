package com.rodrigomoral.kotlinmvvm

import androidx.lifecycle.MutableLiveData

/**
 * Created by Liquid Squad at Accenture Digital on 10/10/18.
 */


/**
 * Set the initial value of a MutableLiveData object
 */
fun <T : Any?> MutableLiveData<T>.default(initialValue: T) = apply { setValue(initialValue) }
