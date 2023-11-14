package com.nexis.shopsmart.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.farzin.shopsmarttest.base.BaseActivity
import com.nexis.shopsmart.R
import com.nexis.shopsmart.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        setupBottomNav()
    }

    private fun setupBottomNav() {
        val navController = findNavController(R.id.container)
        binding.bottomNavBar.setupWithNavController(navController)

        navController.addOnDestinationChangedListener{ controller, destination, arguments ->

        }
    }
}