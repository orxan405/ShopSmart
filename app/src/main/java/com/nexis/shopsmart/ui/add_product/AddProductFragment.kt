package com.nexis.shopsmart.ui.add_product

import android.Manifest
import android.content.ContentValues
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import com.example.shopssmart.components.adapters.CategoryAdapter
import com.nexis.shopsmart.base.BaseFragment
import com.nexis.shopsmart.databinding.FragmentAddProductBinding
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.view_models.AddProductViewModel
import java.util.UUID

class AddProductFragment :
    BaseFragment<FragmentAddProductBinding>(FragmentAddProductBinding::inflate) {

    private val cameraPermission = Manifest.permission.CAMERA

    private var imageUri: Uri? = null

    private val viewModel: AddProductViewModel by viewModels()


    lateinit var addProduct: CategoryAdapter


    private val cameraPermissonResult =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isPermitted ->
            if (isPermitted) {
                startCameraAction()
            }
        }

    private val captureResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            imageUri?.let {
                // binding.imgAddProductImage.setImageURI(it)
            }
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.inputProductTitle.setTitle("Name")
        binding.inputProductPrice.setTitle("Price")
        binding.inputProductDescription.setTitle("Description")

        binding.imgAddProductImage.setOnClickListener {
            cameraPermissonResult.launch(cameraPermission)
        }

        binding.buttonAddProduct.setOnClickListener {path ->
            imageUri?.let { image ->
                viewModel.uploadImage(image) { path ->
                    val productItem = ProductModel(
                        productId = UUID.randomUUID().toString(),
                        productTitle = "",
                        productPrice = "",
                        productDescription = "",
                        productImage = path
                    )
                    viewModel.addNewProduct(productItem)
                }
            }
        }
    }

    private fun startCameraAction() {

        imageUri = requireActivity().contentResolver.insert(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            ContentValues()
        )
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)

        captureResult.launch(cameraIntent)

    }

}