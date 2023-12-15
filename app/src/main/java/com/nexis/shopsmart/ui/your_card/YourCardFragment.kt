package com.nexis.shopsmart.ui.your_card

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.nexis.shopsmart.base.BaseFragment
import com.nexis.shopsmart.components.adapters.YourCardAdapter
import com.nexis.shopsmart.databinding.FragmentYourCardBinding
import com.nexis.shopsmart.model.local.YourCardModel
import com.nexis.shopsmart.util.BundleNames
import com.nexis.shopsmart.util.getMockYourCard

class YourCardFragment: BaseFragment<FragmentYourCardBinding>(FragmentYourCardBinding::inflate) {
    lateinit var yourCardAdapter: YourCardAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
//        val item = requireArguments().getParcelable<YourCardModel>(BundleNames.SELECTED_ITEM)

        yourCardAdapter = YourCardAdapter { selectedCards -> }

        binding.recyclerYourCard.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        val cardList = getMockYourCard()

        binding.recyclerYourCard.adapter = yourCardAdapter
        yourCardAdapter.setData(cardList)
    }
}