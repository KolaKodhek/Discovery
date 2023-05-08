package com.example.discover

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.discover.databinding.ProductItemBinding


class ProductAdapter(
    private val productItem:ArrayList<Product>,
    //private val onProductClickListener: OnProductClickListener
):RecyclerView.Adapter<ProductAdapter.ProductItemViewHolder>(){

   //inner class ProductItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    inner class ProductItemViewHolder(val productBinding:ProductItemBinding):RecyclerView.ViewHolder(productBinding.root){
        fun bindProduct(product:Product){
            productBinding.productImage.setImageResource(product.productImage)
            productBinding.tvDescription.text=product.productDesc
            productBinding.price.text=product.productPrice.toString()
            productBinding.currency.text=product.productCurrency
            productBinding.cart.setImageResource(product.cartImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        return ProductItemViewHolder(ProductItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
//        val currentProduct= productItem[position]
//        holder.itemView.apply {
//            product_image.setImageResource(currentProduct.productImage)
//            tvDescription.text=currentProduct.productDesc
//            currency.text=currentProduct.productCurrency
//            price.text=currentProduct.productPrice.toString()
//            cart.setImageResource(currentProduct.cartImage)
//
//        }
        val product= productItem[position]
        holder.bindProduct(product)
//        holder.productBinding.root.setOnClickListener {
//            onProductClickListener.onProductClick(position)
//        }

    }
    override fun getItemCount(): Int {
       return productItem.size
    }

}