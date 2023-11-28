package com.nexis.shopsmart.view_models

import androidx.lifecycle.ViewModel
import com.nexis.shopsmart.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository): ViewModel()  {
}