package com.nexis.shopsmart.model.local

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductModel(
    val id: Int,
    val productId: String,
    val productTitle: String,
    val productImage: Int,
    val productPrice: String,
    val productDescription: String,
    val isFavorite: Boolean = false

) : Parcelable