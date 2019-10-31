package dev.olog.shrine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.olog.shrine.filter.FilterFragment
import dev.olog.shrine.products.ProductsFragment
import dev.olog.shrine.shopping.cart.ShoppingCartFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.content, FilterFragment())
                .add(R.id.content, ProductsFragment())
                .add(R.id.content, ShoppingCartFragment())
                .commitNow()
        }
    }
}
