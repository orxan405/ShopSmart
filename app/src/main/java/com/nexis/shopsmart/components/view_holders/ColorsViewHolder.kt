package com.nexis.shopsmart.components.view_holders

import com.farzin.shopsmarttest.base.BaseViewHolder
import com.nexis.shopsmart.components.adapters.ColorsAdapter
import com.nexis.shopsmart.databinding.ItemColorsBinding
import com.nexis.shopsmart.model.local.ColorsModel

class ColorsViewHolder(
    val binding: ItemColorsBinding,
    val onClick: (ColorsModel) -> Unit
) :  BaseViewHolder<ColorsModel, ItemColorsBinding>(binding) {
    override fun bind(item: ColorsModel) {
        binding.ivColors.setImageResource(item.colorsName)
    }


}