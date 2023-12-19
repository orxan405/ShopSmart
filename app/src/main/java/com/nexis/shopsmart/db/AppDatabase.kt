package com.nexis.shopsmart.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nexis.shopsmart.model.local.ProductModel

@Database(entities = [ProductModel::class], version = 7)
abstract class AppDatabase:RoomDatabase() {
    abstract fun getProductDao():ProductDao
}