package com.nexis.shopsmart.ui.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shopssmart.components.adapters.BannerAdapter
import com.example.shopssmart.components.adapters.CategoryAdapter
import com.farzin.shopsmarttest.base.BaseFragment
import com.google.firebase.Firebase
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.database
import com.nexis.shopsmart.R
import com.nexis.shopsmart.components.adapters.ColorsAdapter
import com.nexis.shopsmart.components.adapters.ProductAdapter
import com.nexis.shopsmart.databinding.FragmentHomeBinding
import com.nexis.shopsmart.util.BundleNames.SELECTED_ITEM
import com.nexis.shopsmart.util.Mock.getMockProducts
import com.nexis.shopsmart.util.UtilFunctions.getNavOptions
import com.nexis.shopsmart.util.getMockBanners
import com.nexis.shopsmart.util.getMockCategories

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    lateinit var productAdapter: ProductAdapter
    lateinit var categoryAdapter: CategoryAdapter
    lateinit var bannerAdapter: BannerAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()

        val database = Firebase.database
        val myRef = database.getReference("mesaj")

        myRef.setValue("Salam Dunya..")

        myRef.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val myValue = snapshot.value
            }

            override fun onCancelled(error: DatabaseError) {
                val onCancelled = error.message
            }

        })


    }

    private fun initView() {
        productAdapter = ProductAdapter { productModel ->
            findNavController().navigate(
                R.id.action_homeFragment_to_productDetailsFragment,
                bundleOf(SELECTED_ITEM to productModel), getNavOptions()
            )
        }
        categoryAdapter = CategoryAdapter { selectedCategory ->

        }

        bannerAdapter = BannerAdapter { selectedBannaer -> }




        binding.recyclerViewCategory.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewProducts.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerViewBanner.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val list = getMockProducts()
        val categoryList = getMockCategories()
        val bannerList = getMockBanners()

        binding.recyclerViewProducts.adapter = productAdapter
        binding.recyclerViewCategory.adapter = categoryAdapter
        binding.recyclerViewBanner.adapter = bannerAdapter

        productAdapter.setData(list)
        categoryAdapter.setData(categoryList)
        bannerAdapter.setData(bannerList)
    }

}