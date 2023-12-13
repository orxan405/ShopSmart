package com.nexis.shopsmart.view_models

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.repository.AddProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddProductViewModel @Inject constructor(private val addProductRepository: AddProductRepository) : ViewModel() {

    fun addNewProduct(productModel: ProductModel){
        addProductRepository.addNewProduct(productModel)
    }

    fun uploadImage(imageUri: Uri, onUploadComplete: (String) -> Unit){
        addProductRepository.uploadImage(imageUri){
            onUploadComplete.invoke(it)
        }
    }

}