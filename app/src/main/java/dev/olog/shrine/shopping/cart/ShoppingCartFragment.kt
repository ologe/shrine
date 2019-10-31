package dev.olog.shrine.shopping.cart

import android.os.Bundle
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.math.MathUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import dev.olog.shrine.R
import dev.olog.shrine.utils.MotionLayoutTransitionListener
import kotlinx.android.synthetic.main.fragment_shopping_cart.*

class ShoppingCartFragment : Fragment(R.layout.fragment_shopping_cart), MotionLayoutTransitionListener {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        miniList.adapter = ShoppingCartAdapter()
        miniList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

    override fun onStart() {
        super.onStart()
        shoppingCartContent.setTransitionListener(this)
    }

    override fun onStop() {
        super.onStop()
        shoppingCartContent.setTransitionListener(null)
    }

    override fun onTransitionChange(view: MotionLayout, startId: Int, endId: Int, progress: Float) {
        if (startId == R.id.start && endId == R.id.end){
            contentContainer.progress = MathUtils.clamp(1f - progress, 0f, 1f)
        }
    }


}