package com.nexis.shopsmart.components.view_holders

import com.bumptech.glide.Glide
import com.nexis.shopsmart.base.BaseViewHolder
import com.nexis.shopsmart.R
import com.nexis.shopsmart.databinding.ItemProductViewBinding
import com.nexis.shopsmart.model.local.ProductModel

class ProductViewHolder(
    val binding: ItemProductViewBinding,
    val onClick: (ProductModel) -> Unit
) : BaseViewHolder<ProductModel, ItemProductViewBinding>(binding) {
    override fun bind(item: ProductModel) {
        binding.txtProductTitle.text = item.productTitle
        binding.txtProductPrice.text = item.productPrice

        item.productImage?.let {
            Glide.with(binding.root.context)
                .load(it)
                .into(binding.productImage)
        }


        if (item.isFavorite) {
            binding.imgMakeFavourite.setImageResource(R.drawable.ic_heart)
        } else {
            binding.imgMakeFavourite.setImageResource(R.drawable.ic_heart_red)
        }

        binding.item.setOnClickListener {
            onClick(item)
        }
    }

}