package com.nexis.shopsmart.components.view_holders

import android.content.ClipData.Item
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.nexis.shopsmart.base.BaseViewHolder
import com.nexis.shopsmart.R
import com.nexis.shopsmart.databinding.ItemProductViewBinding
import com.nexis.shopsmart.model.local.ProductModel

class ProductViewHolder(
    val binding: ItemProductViewBinding,
    val onClick: (ProductModel) -> Unit,
    val onMakeFavorite: (ProductModel) -> Unit,
    val onAddtoCardClicked: (ProductModel) -> Unit
) : BaseViewHolder<ProductModel, ItemProductViewBinding>(binding) {
    override fun bind(item: ProductModel) {

        binding.txtProductTitle.text = item.productTitle
        binding.txtProductPrice.text = item.productPrice

        val circularProgressDrawable = CircularProgressDrawable(binding.root.context)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()

        item.productImage?.let {
            Glide.with(binding.root.context)
                .load(it)
                .placeholder(circularProgressDrawable)
                .into(binding.productImage)
        }


        if (item.isFavorite) {
            binding.imgMakeFavourite.setImageResource(R.drawable.ic_heart_red)
        } else {
            binding.imgMakeFavourite.setImageResource(R.drawable.ic_heart)
        }

        binding.item.setOnClickListener {
            onClick(item)
        }

        binding.imgMakeFavourite.setOnClickListener{
            if (!item.isFavorite){
                binding.imgMakeFavourite.setImageResource(R.drawable.ic_heart_red)
                item.isFavorite = true
            }
            else{
                binding.imgMakeFavourite.setImageResource(R.drawable.ic_heart)
                item.isFavorite = false
            }

            onMakeFavorite(item)

        }
    }

}