package com.nexis.shopsmart.ui.dialogs

import android.os.Bundle
import android.view.View
import com.nexis.shopsmart.R
import com.nexis.shopsmart.base.BaseBottomSheetDialog
import com.nexis.shopsmart.databinding.BottomSheetOperationBinding
import com.nexis.shopsmart.util.BundleNames.OPERATION_MESSAGE
import com.nexis.shopsmart.util.BundleNames.OPERATION_TYPE
import com.nexis.shopsmart.util.OperationType

class OperationBottomSheet(val onBottomClicked: () -> Unit) :
    BaseBottomSheetDialog<BottomSheetOperationBinding>(BottomSheetOperationBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    fun initViews(){

        when(requireArguments().getString(OPERATION_TYPE)){
            OperationType.SUCCESS.type ->{
                binding.operationAnim.setAnimation(R.raw.success_animation)
            }

            OperationType.ERROR.type ->{
                binding.operationAnim.setAnimation(R.raw.error_animation)
            }
        }

        binding.txtOperationMessage.text = requireArguments().getString(OPERATION_MESSAGE)

        binding.btnOk.setOnClickListener{
            onBottomClicked()
            dismiss()
        }
    }
}