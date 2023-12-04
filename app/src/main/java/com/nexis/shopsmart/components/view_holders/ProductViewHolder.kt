package com.nexis.shopsmart.components.view_holders

import com.farzin.shopsmarttest.base.BaseViewHolder
import com.nexis.shopsmart.R
import com.nexis.shopsmart.databinding.ItemProductViewBinding
import com.nexis.shopsmart.model.local.ProductModel

class ProductViewHolder(val binding: ItemProductViewBinding,
                        val onClick: (ProductModel) -> Unit): BaseViewHolder<ProductModel, ItemProductViewBinding>(binding) {
    override fun bind(item: ProductModel) {
        binding.txtProductTitle.text = item.productTitle
        binding.txtProductPrice.text = item.productPrice
        item.productImage?.let { binding.productImage.setImageResource(it) }
        if(item.isFavorite){
            binding.imgMakeFavourite.setImageResource(R.drawable.ic_heart_red)
        }else{
            binding.imgMakeFavourite.setImageResource(R.drawable.ic_heart)
        }

        binding.item.setOnClickListener {
            onClick(item)
        }
    }

}