package dev.olog.shrine.shopping.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.olog.shrine.Product
import dev.olog.shrine.R

class ShoppingCartAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val data = mutableListOf<Product>()

    init {
        data.add(0, Product.Header("cart"))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(viewType, parent, false)
        return object : RecyclerView.ViewHolder(view) {}
    }

    override fun getItemViewType(position: Int): Int = when (data[position]) {
        is Product.Header -> R.layout.item_product_header
        is Product.Actual -> R.layout.item_product
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // TODO
    }
}