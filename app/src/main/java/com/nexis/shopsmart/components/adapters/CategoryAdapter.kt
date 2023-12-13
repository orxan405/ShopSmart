package com.example.shopssmart.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.shopssmart.components.view_holders.CategoryViewHolder
import com.example.shopssmart.model.local.CategoryModel
import com.nexis.shopsmart.base.BaseRecyclerAdapter
import com.nexis.shopsmart.databinding.ItemCategoryBinding

class CategoryAdapter(val onClick: (CategoryModel) -> Unit) :
    BaseRecyclerAdapter<CategoryModel, ItemCategoryBinding, CategoryViewHolder>() {
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemCategoryBinding {
        return ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun createViewHolder(
        binding: ItemCategoryBinding,
        viewType: Int
    ): CategoryViewHolder {
        return CategoryViewHolder(binding, onClick)
    }

}