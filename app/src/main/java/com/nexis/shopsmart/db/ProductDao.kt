package com.nexis.shopsmart.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nexis.shopsmart.model.local.ProductModel

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertProduct(productModel: ProductModel)

    @Query("SELECT * FROM product_table")
    fun getAllProducts(): List<ProductModel>

    @Query("SELECT * FROM product_table WHERE isFavorite = 1")
    fun getAllFavoriteProducts() : List<ProductModel>

    @Query("UPDATE product_table SET isFavorite=:favorite WHERE id=:id")
    fun makeItemFavorite(id: Int?, favorite: Boolean)
}