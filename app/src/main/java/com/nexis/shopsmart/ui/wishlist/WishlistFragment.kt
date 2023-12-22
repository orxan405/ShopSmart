package com.nexis.shopsmart.ui.wishlist

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.nexis.shopsmart.R
import com.nexis.shopsmart.base.BaseFragment
import com.nexis.shopsmart.components.adapters.ProductAdapter
import com.nexis.shopsmart.databinding.FragmentWishlistBinding
import com.nexis.shopsmart.util.BundleNames
import com.nexis.shopsmart.util.UtilFunctions.getNavOptions
import com.nexis.shopsmart.view_models.HomeViewModel

class WishlistFragment : BaseFragment<FragmentWishlistBinding>(FragmentWishlistBinding::inflate) {
    private val viewModel: HomeViewModel by viewModels()
    private lateinit var productAdapter: ProductAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        observeResults()
        viewModel.getAllFavoriteProducts()
    }

    private fun initViews() {
        productAdapter = ProductAdapter(
            onClickItem = { productModel ->
                findNavController().navigate(R.id.action_homeFragment_to_productDetailsFragment, bundleOf(
                    BundleNames.SELECTED_ITEM to productModel), getNavOptions())
            },
            onMakeFavorite = { productModel->
                viewModel.makeItemFavorite(productModel)
            },
            onAddtoCardClicked = {

            }
        )

        binding.recyclerViewWishlist.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerViewWishlist.adapter = productAdapter
    }

    private fun observeResults() {
        viewModel.favoriteProductsLiveData.observe(viewLifecycleOwner){ favotitePorducts->
            productAdapter.setData(favotitePorducts)
        }
    }
}