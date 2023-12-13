package com.nexis.shopsmart.repository

import android.net.Uri
import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.util.FirebaseReferenceNames
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

import javax.inject.Inject

class AddProductRepository @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val firebaseStorage: FirebaseStorage
) {


    fun addNewProduct(productModel: ProductModel) {
        firebaseDatabase.reference.child(FirebaseReferenceNames.PRODUCT_REFERENCE_NAME).child(productModel.productId.toString())
            .setValue(productModel)
    }

    fun uploadImage(imageUri: Uri, onUploadComplete: (String) -> Unit) {
         val uploladRef = firebaseStorage.reference.child("images_${System.currentTimeMillis()}.jpg")

         uploladRef.putFile(imageUri).addOnSuccessListener {
             uploladRef.downloadUrl.addOnSuccessListener {
                 onUploadComplete.invoke(it.toString())
                 Log.i("Imageurl", it.toString())
             }
         }.addOnCanceledListener {

         }
    }
}