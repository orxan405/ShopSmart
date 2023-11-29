package com.nexis.shopsmart.components.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.farzin.shopsmarttest.base.BaseRecyclerAdapter
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

//        binding.ivMinus.setOnClickListener {
//            var say: Int = 0
//
//            var txtSay: String = binding.txtSay.text.toString()
//
//            var dd: Int = txtSay.toInt()
//
//            if (dd > 0) {
//                say = say - 1
//            } else if (dd <= 0) {
//                binding.txtSay.setText("0")
//            }
//        }
//
//        binding.ivPilus.setOnClickListener {
//            var say: Int = 0
//
//            var txtSay: String = binding.txtSay.text.toString()
//
//            var dd: Int = txtSay.toInt()
//
//            if (dd == 0) {
//                say = say + 1
//            } else if (dd <= 0) {
//                binding.txtSay.setText("0")
//            }
//        }

    }
}