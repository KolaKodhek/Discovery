package com.example.discover

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment(){
    //, OnProductClickListener
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var productArraylist:ArrayList<Product>

    private lateinit var chart:ImageView
    //private lateinit var onProductClickListener:OnProductClickListener

    lateinit var productImage:Array<Int>
    private lateinit var productCurrency:Array<String>
    lateinit var productPrice:Array<Int>
    lateinit var productDesc:Array<String>
    lateinit var cartImage:Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        chart=view.findViewById(R.id.message)
        chart.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager= GridLayoutManager(requireContext(),2,GridLayoutManager.VERTICAL,false)
            //LinearLayoutManager(context)
        recyclerView =view.findViewById(R.id.rv_home)
        recyclerView.layoutManager=layoutManager
        recyclerView.setHasFixedSize(true)
        productAdapter= ProductAdapter(productArraylist)
        recyclerView.adapter=productAdapter

    }



    private fun dataInitialize(){
        productArraylist= arrayListOf<Product>()

        productImage= arrayOf(
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
            R.drawable.laptop,
        )
        productCurrency= arrayOf(
            "USD",
            "USD",
            "USD",
            "USD",
            "USD",
            "USD",
            "USD",
            "USD",
            "USD",
            "USD",
            "USD",
            "USD",
        )
        productDesc= arrayOf(
            "Brand New Dell",
            "Lenovo Think pad",
            "HP pro-book",
            "Dell Spiro",
            "HP Elite book",
            "Lenovo Brand-new",
            "HP refurbished",
            "Think pad Lenovo",
            "Macbook Pro2019",
            "HP pro-book",
            "Dell Spiro",
            "Mac pro-book2020",
        )
        productPrice= arrayOf(
            12345,
            23456,
            34567,
            45678,
            56789,
            12345,
            23456,
            34567,
            45678,
            56789,
            12345,
            56789
        )
        cartImage= arrayOf(

            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,
            R.drawable.add_to_cart,

        )

        for (i in productImage.indices){

            val products= Product(productImage[i], productCurrency[i],productPrice[i],productDesc[i],cartImage[i])
            productArraylist.add(products)

        }

    }
//        override fun onProductClick(position: Int) {
//
//        val intent = Intent(context, ProductDetails::class.java)
//
//        intent.putExtra("product_Image", productArraylist[position].productImage)
//        intent.putExtra("product_Desc",productArraylist[position].productDesc)
//        intent.putExtra("product_Price",productArraylist[position].productPrice)
//        intent.putExtra("product_Currency",productArraylist[position].productCurrency)
//        intent.putExtra("cart_Image",productArraylist[position].cartImage)
//
//
//        startActivity(intent)
//    }
}


