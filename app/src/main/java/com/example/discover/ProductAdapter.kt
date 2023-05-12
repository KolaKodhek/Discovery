package com.example.discover

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.discover.databinding.ProductItemBinding


class ProductAdapter(
    private val productItem: ArrayList<Product>,
    private val  onProductClicked: (Product) -> Unit,

    //private val onProductClickListener: OnProductClickListener
):RecyclerView.Adapter<ProductAdapter.ProductItemViewHolder>(){

   //inner class ProductItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    inner class ProductItemViewHolder(val productBinding:ProductItemBinding):RecyclerView.ViewHolder(productBinding.root){
        fun bindProduct(products:Product){
            productBinding.productImage.setImageResource(products.productImage)
            productBinding.tvDescription.text=products.productDesc
            productBinding.price.text=products.productPrice.toString()
            productBinding.currency.text=products.productCurrency
            productBinding.cart.setImageResource(products.cartImage)
            productBinding.root.setOnClickListener {
                onProductClicked(products)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        return ProductItemViewHolder(ProductItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
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