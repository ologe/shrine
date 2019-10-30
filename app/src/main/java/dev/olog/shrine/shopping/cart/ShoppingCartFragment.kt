package dev.olog.shrine.shopping.cart

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import dev.olog.shrine.R
import kotlinx.android.synthetic.main.fragment_shopping_cart.*

class ShoppingCartFragment : Fragment(R.layout.fragment_shopping_cart) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        miniList.adapter = ShoppingCartAdapter()
        miniList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

}