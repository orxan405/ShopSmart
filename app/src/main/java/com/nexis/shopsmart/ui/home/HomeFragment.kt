package com.nexis.shopsmart.ui.home

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.farzin.shopsmarttest.base.BaseFragment
import com.nexis.shopsmart.components.adapters.ProductAdapter
import com.nexis.shopsmart.databinding.FragmentHomeBinding
import com.nexis.shopsmart.util.Mock.getMockProducts

class HomeFragment: BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    lateinit var productAdapter: ProductAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()

    }

    private fun initView() {
        productAdapter = ProductAdapter()
        binding.recyclerViewProducts.layoutManager = GridLayoutManager(requireContext(), 2)
        val list = getMockProducts()
        binding.recyclerViewProducts.adapter = productAdapter
        productAdapter.setData(list)
    }

}