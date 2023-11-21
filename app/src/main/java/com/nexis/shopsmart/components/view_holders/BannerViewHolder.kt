package com.example.shopssmart.components.view_holders


import com.example.shopssmart.model.local.BannerModel
import com.farzin.shopsmarttest.base.BaseViewHolder
import com.nexis.shopsmart.databinding.ItemBannerViewBinding

class BannerViewHolder(    val binding: ItemBannerViewBinding) :  BaseViewHolder<BannerModel, ItemBannerViewBinding>(binding) {
    override fun bind(item: BannerModel) {
        binding.imageBanner.setImageResource(item.bannerIcon)
    }
}