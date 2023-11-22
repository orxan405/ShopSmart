package com.nexis.shopsmart.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.farzin.shopsmarttest.base.BaseActivity
import com.nexis.shopsmart.R
import com.nexis.shopsmart.databinding.ActivityMainBinding
import com.nexis.shopsmart.ui.search.SearchDialogFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        initViews()
        setupBottomNav()
    }

    private fun initViews() {
        binding.imgBackArrow.setOnClickListener {
            onBackPressed()
        }

        binding.searchView.setOnClickListener{
            val dialog = SearchDialogFragment()
            dialog.show(supportFragmentManager, "Salam")
        }
    }

    private fun setupBottomNav() {
        val navController = findNavController(R.id.container)
        binding.bottomNavBar.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            binding.searchView.apply {

                isVisible = if (destination.id in setOf(R.id.homeFragment, R.id.profileFragment)) {
                    true
                } else {
                    false
                }
            }


            binding.txtAppBarTitle.apply {
                text = controller.currentDestination?.label
                isVisible = if (destination.id !in setOf(R.id.homeFragment, R.id.profileFragment)){
                    true
                }
                else{
                    false
                }
            }

            binding.imgBackArrow.apply {
                isVisible = if (destination.id !in setOf(R.id.homeFragment, R.id.profileFragment)){
                    true
                }
                else{
                    false
                }
            }

            binding.bottomNavBar.apply {
                isVisible = if (destination.id !in setOf(R.id.productDetailsFragment)){
                    true
                } else {
                    false
                }
            }


            Log.i("CurrentFragmentId", destination.id.toString())
        }
    }
}