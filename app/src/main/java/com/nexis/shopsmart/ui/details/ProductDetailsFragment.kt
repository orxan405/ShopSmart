package com.farzin.shopsmart.ui.details

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.farzin.shopsmarttest.base.BaseFragment
import com.nexis.shopsmart.components.adapters.ColorsAdapter
import com.nexis.shopsmart.databinding.FragmentProductDetailsBinding
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.util.BundleNames.SELECTED_ITEM
import com.nexis.shopsmart.util.getMockBanners
import com.nexis.shopsmart.util.getMockColors

class ProductDetailsFragment : BaseFragment<FragmentProductDetailsBinding>(FragmentProductDetailsBinding::inflate) {

    lateinit var colorsAdapter: ColorsAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val item = requireArguments().getParcelable<ProductModel>(SELECTED_ITEM)
        item

        colorsAdapter = ColorsAdapter { selectedColors -> }

        binding.recyclerViewColors.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val colorsList = getMockColors()

        binding.recyclerViewColors.adapter = colorsAdapter
        colorsAdapter.setData(colorsList)
    }

}