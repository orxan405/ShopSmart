package com.nexis.shopsmart.repository

import com.google.firebase.database.FirebaseDatabase
import javax.inject.Inject

class HomeRepository @Inject constructor (private val firebaseDatabase: FirebaseDatabase) {
    fun getNewAddedProduct(){
        firebaseDatabase
    }
}