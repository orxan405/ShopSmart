package com.nexis.shopsmart.model.local

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "product_table", indices = [Index(value = ["productId"], unique = true)] )
data class ProductModel(

    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int? = null,

    @ColumnInfo(name = "productId")
    val productId: String? = null,

    @ColumnInfo(name = "productTitle")
    val productTitle: String? = null,

    @ColumnInfo(name = "productImage")
    val productImage: String? = null,

    @ColumnInfo(name = "productPrice")
    val productPrice: String? = null,

    @ColumnInfo(name = "productCategoryId")
    val productCategoryId: Int? = null,

    @ColumnInfo(name = "productDescription")
    val productDescription: String? = null,

    @ColumnInfo(name = "isFavorite")
    val isFavorite: Boolean = false

) : Parcelable