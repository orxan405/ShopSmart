package com.nexis.shopsmart.components.custom_views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.nexis.shopsmart.databinding.LayoutCustomSearchBinding

class CustomSearchView @JvmOverloads constructor(
    val ctx: Context,
    val attsSet: AttributeSet? = null,
    val styleDef: Int = 0
) : LinearLayout(ctx, attsSet, styleDef) {
    private val binding = LayoutCustomSearchBinding.inflate(LayoutInflater.from(context), this, true)

    init {

    }
}