package com.example.shopssmart.components.view_holders


import com.example.shopssmart.components.adapters.CategoryAdapter
import com.example.shopssmart.model.local.CategoryModel
import com.farzin.shopsmarttest.base.BaseViewHolder
import com.nexis.shopsmart.databinding.ItemCategoryBinding

class CategoryViewHolder(
    val binding: ItemCategoryBinding,
    val onClick: (CategoryAdapter) -> Unit
) :
    BaseViewHolder<CategoryModel, ItemCategoryBinding>(binding) {
    override fun bind(item: CategoryModel) {
        binding.txtCategoryName.text = item.categoryName
        binding.imageCategory.setImageResource(item.categoryIcon)

    }
}