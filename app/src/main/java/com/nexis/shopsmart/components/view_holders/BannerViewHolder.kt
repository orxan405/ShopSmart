package com.example.shopssmart.components.view_holders


import com.example.shopssmart.components.adapters.BannerAdapter
import com.example.shopssmart.components.adapters.CategoryAdapter
import com.example.shopssmart.model.local.BannerModel
import com.farzin.shopsmarttest.base.BaseViewHolder
import com.nexis.shopsmart.databinding.ItemBannerViewBinding

class BannerViewHolder( val binding: ItemBannerViewBinding,
                        val onClick: (BannerAdapter) -> Unit) :  BaseViewHolder<BannerModel, ItemBannerViewBinding>(binding) {
    override fun bind(item: BannerModel) {
        binding.imageBanner.setImageResource(item.bannerIcon)
    }
}