package com.nexis.shopsmart.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nexis.shopsmart.di.FirebaseModule_ProvideFirebaseDatabaseFactory
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) : ViewModel() {

    private val _productsLiveData: MutableLiveData<ArrayList<ProductModel>> = MutableLiveData()
    val productsLiveData: LiveData<ArrayList<ProductModel>> = _productsLiveData
    fun getAllProduct() {
        homeRepository.getAllProducts()
    }

    fun addNewProduct(productModel: ProductModel) {
        homeRepository.addNewProduct(productModel)
    }

}