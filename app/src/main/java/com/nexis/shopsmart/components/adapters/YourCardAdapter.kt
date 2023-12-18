package com.nexis.shopsmart.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.nexis.shopsmart.base.BaseRecyclerAdapter
import com.nexis.shopsmart.components.view_holders.YourCardViewHolder
import com.nexis.shopsmart.databinding.FragmentYourCardBinding
import com.nexis.shopsmart.databinding.ItemYourCardBinding
import com.nexis.shopsmart.model.local.YourCardModel

class YourCardAdapter(val onClick: (YourCardAdapter) -> Unit) :
    BaseRecyclerAdapter<YourCardModel, ItemYourCardBinding, YourCardViewHolder>() {
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemYourCardBinding {
        return ItemYourCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun createViewHolder(binding: ItemYourCardBinding, viewType: Int): YourCardViewHolder {
        return YourCardViewHolder(binding, onClick)

    }
}