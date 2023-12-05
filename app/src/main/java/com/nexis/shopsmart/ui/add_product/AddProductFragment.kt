package com.nexis.shopsmart.ui.add_product

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.farzin.shopsmarttest.base.BaseFragment
import com.nexis.shopsmart.R
import com.nexis.shopsmart.databinding.FragmentAddProductBinding
import com.nexis.shopsmart.databinding.FragmentHomeBinding
class AddProductFragment : BaseFragment<FragmentAddProductBinding>(FragmentAddProductBinding::inflate) {

    lateinit var imageView: ImageView

    private val gender = ArrayList<String>()
    private lateinit var veriAdap: ArrayAdapter<String>

//    companion object{
//        val IMAGE_REQUEST_CODE = 100
//    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gender.add("Kişi")
        gender.add("Qadın")

        veriAdap = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            gender
        )

        binding.spinner.adapter = veriAdap


//        binding.imgSave.setOnClickListener{
//            pickImageGallery()
//
//        }


    }

//    fun pickImageGallery(){
//        val intent = Intent(Intent.ACTION_PICK)
//        intent.type= "image/*"
//        startActivityForResult(intent, IMAGE_REQUEST_CODE)
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == IMAGE_REQUEST_CODE && resultCode == AppCompatActivity.RESULT_OK){
//            imageView.setImageURI(data?.data)
//        }
//    }


}