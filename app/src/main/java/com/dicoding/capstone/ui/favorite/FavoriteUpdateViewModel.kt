package com.dicoding.capstone.ui.favorite

import android.app.Application
import androidx.lifecycle.ViewModel
import com.dicoding.capstone.database.Favorite

class FavoriteUpdateViewModel(application: Application): ViewModel() {
    private val mFavoriteRepository: FavoriteRepository = FavoriteRepository(application)

    fun insert(favorite: Favorite) {
        mFavoriteRepository.insert(favorite)
    }


    fun delete(favorite: Favorite) {
        mFavoriteRepository.delete(favorite)
    }

}