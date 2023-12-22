package com.nexis.shopsmart.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) : ViewModel() {

    private val _productsLiveData: MutableLiveData<ArrayList<ProductModel>> = MutableLiveData()
    val productsLiveData: LiveData<ArrayList<ProductModel>> = _productsLiveData

    private val _favoriteProductsLiveData: MutableLiveData<ArrayList<ProductModel>> = MutableLiveData()
    val favoriteProductsLiveData: LiveData<ArrayList<ProductModel>> = _favoriteProductsLiveData

    init {
        homeRepository.getNewAddedProduct()
    }
    fun getAllProduct() = viewModelScope.launch {
        homeRepository.getAllProducts().also {productList ->
            _productsLiveData.postValue(productList as ArrayList<ProductModel>)
        }
    }

    fun getAllFavoriteProducts() = viewModelScope.launch {
        homeRepository.getAllFavoriteProducts().also { productList->
            _favoriteProductsLiveData.postValue(productList as ArrayList<ProductModel>)
        }
    }

    fun makeItemFavorite(productModel: ProductModel) = viewModelScope.launch {
        homeRepository.makeItemFavorite(productModel)
    }

}