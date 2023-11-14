package com.nexis.shopsmart.model.local

data class ProductModel(
    val id: Int,
    val productId: String,
    val productTitle: String,
    val productImage: Int,
    val productPrice: String,
    val productDescription: String,
    val isFavorite: Boolean = false

)