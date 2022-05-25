package com.dicoding.capstone.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchViewModel : ViewModel() {

    companion object {
        private const val TAG = "MainViewModel"
    }

    init {
        findUser("sidiqpermana")
    }

    fun findUser(query: String) {

    }
}