package com.nexis.shopsmart.ui.search

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import com.farzin.shopsmarttest.base.BaseDialogFragment
import com.nexis.shopsmart.databinding.DialogSearchInputBinding

class SearchDialogFragment: BaseDialogFragment<DialogSearchInputBinding>(DialogSearchInputBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setStyle(
            DialogFragment.STYLE_NORMAL,
            android.R.style.Theme_Light_NoTitleBar_Fullscreen
        )
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun setSearch(onSearch: (String) -> Unit){

    }
}