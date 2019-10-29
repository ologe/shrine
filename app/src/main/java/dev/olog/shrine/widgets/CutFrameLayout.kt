package dev.olog.shrine.widgets

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.core.content.withStyledAttributes
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import dev.olog.shrine.R
import dev.olog.shrine.colorSurface
import dev.olog.shrine.dipf

class CutFrameLayout(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    init {
        context.withStyledAttributes(set = attrs, attrs = R.styleable.CutFrameLayout) {
            val radius = getDimension(R.styleable.CutFrameLayout_cutRadius, context.dipf(16))

            val shape = ShapeAppearanceModel.builder()
                .setTopLeftCorner(CornerFamily.CUT, radius)
                .build()

            background = MaterialShapeDrawable(shape).apply {
                backgroundTintList = getColorStateList(R.styleable.CutFrameLayout_cutTint) ?: ColorStateList.valueOf(context.colorSurface())
            }
        }
    }

}