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
        binding.txtBasliq.text = "Məhsulun adı: " + item.CardBasliq
        binding.txtQiymeti.text ="Qiyməti: " + item.CardQiymeti + " AZN"
        binding.txtRengi.text = "Rəngi: " + item.CardRengi
        binding.txtSay.text = item.CardSayi.toString()
        binding.ivMinus.isEnabled = false
        binding.ivPilus.isEnabled = false
        binding.ivRemove.isEnabled = false

        var d1: Int = 0
        val checkBox = binding.chbSecim
        val imageViewP = binding.ivPilus
        val imageViewM = binding.ivMinus
        val imageViewR = binding.ivRemove

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            imageViewP.isEnabled = isChecked
            imageViewM.isEnabled = isChecked
            imageViewR.isEnabled = isChecked
            d1 = 0
            binding.txtSay.setText("0")
        }





        binding.ivPilus.setOnClickListener {
            var say: String = binding.txtSay.text.toString()

            var dd: Int = say.toInt()
            if (dd >= 0) {


                d1 = d1 + 1

                binding.txtSay.setText(d1.toString())
            }
        }

        binding.ivMinus.setOnClickListener {
            var say: String = binding.txtSay.text.toString()

            var dd: Int = say.toInt()
            if (dd > 0) {


                d1 = d1 - 1

                binding.txtSay.setText(d1.toString())
            } else if (d1 < 0) {
                d1 = 0
                binding.txtSay.setText("0")
            }
        }


        binding.ivRemove.setOnClickListener {
            binding.txtSay.setText("0")
            d1 = 0
        }
    }


}