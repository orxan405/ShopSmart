package com.nexis.shopsmart.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.farzin.shopsmarttest.base.BaseRecyclerAdapter
import com.nexis.shopsmart.components.view_holders.ColorsViewHolder
import com.nexis.shopsmart.databinding.ItemColorsBinding
import com.nexis.shopsmart.model.local.ColorsModel

class ColorsAdapter(val onClick: (ColorsModel) -> Unit): BaseRecyclerAdapter<ColorsModel, ItemColorsBinding, ColorsViewHolder>() {
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemColorsBinding {
        return ItemColorsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun createViewHolder(binding: ItemColorsBinding, viewType: Int): ColorsViewHolder {
        return ColorsViewHolder(binding, onClick)
    }
}