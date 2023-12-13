package com.farzin.shopsmart.components.custom_views

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo
import android.widget.LinearLayout
import com.nexis.shopsmart.databinding.LayoutTextInputFieldBinding


class TextInputField @JvmOverloads constructor(
    ctx: Context,
    attrSet: AttributeSet? = null,
    styleDef: Int = 0
) : LinearLayout(ctx, attrSet, styleDef) {



    private val binding: LayoutTextInputFieldBinding =
        LayoutTextInputFieldBinding.inflate(LayoutInflater.from(context), this, true)

    fun setTitle(title: String) {
        binding.txtTitle.text = title
    }

    fun setInput(input: String) {
        binding.edtInput.setText(input)
    }

}