package com.example.shopssmart.model.local

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CategoryModel(
    val categoryId: Int,
    val categoryName: String,
    val categoryIcon: Int
): Parcelable