package com.nexis.shopsmart.ui.profile

import android.os.Bundle
import android.view.View
import com.nexis.shopsmart.base.BaseFragment
import com.nexis.shopsmart.databinding.FragmentProfileBinding
import com.nexis.shopsmart.util.MainSharedPrefs
import dagger.hilt.android.AndroidEntryPoint
import androidx.navigation.fragment.findNavController
import com.nexis.shopsmart.R
import com.nexis.shopsmart.util.SharedPrefNames.IS_LOGIN
import com.nexis.shopsmart.util.UtilFunctions.getNavOptions
import javax.inject.Inject

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::inflate) {
    @Inject
    lateinit var mainSharedPrefs: MainSharedPrefs


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        checkLogin()
    }

    private fun checkLogin() {
        val isLogin = mainSharedPrefs.getSharedData(IS_LOGIN, false)
        if (!isLogin){
            findNavController().navigate(R.id.action_profileFragment_to_loginFragment, null, getNavOptions())
        }
    }

    private fun initViews() {



    }
}