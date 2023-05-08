package com.example.discover

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.discover.databinding.ActivityProductDetailsBinding

class ProductDetails : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val productDesc=intent.getStringExtra("product_Desc")
        binding.productname.text=productDesc
        val productImage = intent.getIntExtra("product_Image",0)
        binding.productdetailsimage.setImageResource(productImage)
        val productPrice= intent.getStringExtra("product_Price")
        binding.productpricing.text=productPrice
        val productCurrency= intent.getStringExtra("product_Currency")
       binding.productcurrency.text=productCurrency
        val cartImage = intent.getIntExtra("cart_Image",0)
        binding.detailscart.setImageResource(cartImage)
    }
}