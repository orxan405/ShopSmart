package com.nexis.shopsmart.components.view_holders

import com.farzin.shopsmarttest.base.BaseViewHolder
import com.nexis.shopsmart.components.adapters.YourCardAdapter
import com.nexis.shopsmart.databinding.FragmentYourCardBinding
import com.nexis.shopsmart.databinding.ItemYourCardBinding
import com.nexis.shopsmart.model.local.YourCardModel

class YourCardViewHolder(
    val binding: ItemYourCardBinding,
    val onClick: (YourCardAdapter) -> Unit
) : BaseViewHolder<YourCardModel, ItemYourCardBinding>(binding) {
    override fun bind(item: YourCardModel) {
        binding.ivYourCard.setImageResource(item.CardSekili)
        binding.txtBasliq.text = item.CardBasliq
        binding.txtQiymeti.text = item.CardQiymeti
        binding.txtRengi.text = item.CardRengi
        binding.txtSay.text = item.CardSayi.toString()


        binding.ivMinus.setOnClickListener {
            var say: Int = 0

            var txtSay: String = binding.txtSay.text.toString()

            var dd: Int = txtSay.toInt()

            if (dd > 0) {
                say = say - 1
            } else if (dd <= 0) {
                binding.txtSay.setText("0")
            }
        }

        binding.ivPilus.setOnClickListener {
            var say: Int = 0

            var txtSay: String = binding.txtSay.text.toString()

            var dd: Int = txtSay.toInt()

            if (dd == 0) {
                say = say + 1
            } else if (dd <= 0) {
                binding.txtSay.setText("0")
            }
        }
    }


}