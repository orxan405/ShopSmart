package com.nexis.shopsmart.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.nexis.shopsmart.db.ProductDao
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.util.FirebaseReferenceNames.PRODUCT_REFERENCE_NAME
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.concurrent.Flow
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val productDao: ProductDao
) {
    fun getNewAddedProduct() {
        val productRef = firebaseDatabase.getReference().child("dddd")

        productRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                for (sh in snapshot.children) {
                    val product = sh.getValue(ProductModel::class.java)

                    product?.let {
                        CoroutineScope(Dispatchers.IO).launch {
                            insertNewProduct(it)
                        }
                    }

                    Log.i("FirebaseDataChange", "onCancelled: ${product.toString()}")
                }

            }

            override fun onCancelled(error: DatabaseError) {
                Log.i("FirebaseError", "onCancelled: ${error.toString()}")
            }

        })
    }

    suspend fun insertNewProduct(productModel: ProductModel) = withContext(Dispatchers.IO) {
        productDao.insertProduct(productModel)
    }


    fun addNewProduct(productModel: ProductModel) {
//        val productRef = firebaseDatabase.getReference().child(productModel.productId.toString())

        firebaseDatabase.reference.child("dddd").child(productModel.productId.toString())
            .setValue(productModel)

//        productRef.setValue(productModel)
    }

//    suspend fun getAllProducts(): Flow<List<ProductModel>> {
//        val flow = flow {
//            productDao.getAllProducts()
//            emit()
//        }

    suspend fun getAllProducts() {

    }

}