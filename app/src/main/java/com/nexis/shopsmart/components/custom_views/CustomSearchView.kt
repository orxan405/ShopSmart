package com.nexis.shopsmart.components.custom_views

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo
import android.widget.LinearLayout
import com.nexis.shopsmart.databinding.LayoutCustomSearchBinding

class CustomSearchView @JvmOverloads constructor(
    val ctx: Context,
    val attsSet: AttributeSet? = null,
    val styleDef: Int = 0
) : LinearLayout(ctx, attsSet, styleDef) {


    private val binding: LayoutCustomSearchBinding =
        LayoutCustomSearchBinding.inflate(LayoutInflater.from(context), this, true)

    var searchText = binding.edtSearchInput.text.toString()

    var onSearchInView: (String) ->Unit = {}

    init {
        submit()
    }

    fun submit(){
        binding.edtSearchInput.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                onSearchInView(binding.edtSearchInput.text.toString())
                return@setOnEditorActionListener true
            }
            false
        }
    }
}