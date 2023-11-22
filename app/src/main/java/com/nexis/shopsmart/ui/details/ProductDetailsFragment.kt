package com.farzin.shopsmart.ui.details

import android.os.Bundle
import android.view.View
import com.farzin.shopsmarttest.base.BaseFragment
import com.nexis.shopsmart.databinding.FragmentProductDetailsBinding
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.util.BundleNames.SELECTED_ITEM

class ProductDetailsFragment : BaseFragment<FragmentProductDetailsBinding>(FragmentProductDetailsBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val item = requireArguments().getParcelable<ProductModel>(SELECTED_ITEM)
        item
    }

}