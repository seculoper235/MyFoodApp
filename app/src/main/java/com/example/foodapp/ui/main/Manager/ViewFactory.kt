package com.example.foodapp.ui.main.Manager

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.foodapp.ui.main.PageViewModel
import java.lang.IllegalArgumentException

class ViewFactory: ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(PageViewModel::class.java)) {
            PageViewModel() as T
        }
        else {
            throw IllegalArgumentException()
        }
    }
}