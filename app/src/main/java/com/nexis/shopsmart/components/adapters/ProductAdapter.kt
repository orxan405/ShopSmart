package com.nexis.shopsmart.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.nexis.shopsmart.base.BaseRecyclerAdapter
import com.nexis.shopsmart.components.view_holders.ProductViewHolder
import com.nexis.shopsmart.databinding.ItemProductViewBinding
import com.nexis.shopsmart.model.local.ProductModel

class ProductAdapter(val onClickItem: (ProductModel) -> Unit,
                     val onMakeFavorite: (ProductModel) -> Unit,
                     val onAddtoCardClicked: (ProductModel) -> Unit   ) :
    BaseRecyclerAdapter<ProductModel, ItemProductViewBinding, ProductViewHolder>() {
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemProductViewBinding {
        return ItemProductViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun createViewHolder(
        binding: ItemProductViewBinding,
        viewType: Int
    ): ProductViewHolder {
        return ProductViewHolder(binding, onClickItem, onMakeFavorite, onAddtoCardClicked)
    }
}