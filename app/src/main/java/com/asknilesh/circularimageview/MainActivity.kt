package com.asknilesh.circularimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.shape.CornerFamily
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radius = resources.getDimension(R.dimen.image_corner_radius)
        myShapeableImageView.shapeAppearanceModel = myShapeableImageView.shapeAppearanceModel
            .toBuilder()
            .setAllCorners(CornerFamily.ROUNDED, radius)
            .build()

        val topRadius = resources.getDimension(R.dimen.top_corner_radius)
        myShapeableImageView3.shapeAppearanceModel = myShapeableImageView.shapeAppearanceModel
            .toBuilder()
            .setTopRightCorner(CornerFamily.ROUNDED, topRadius)
            .setBottomRightCorner(CornerFamily.ROUNDED, topRadius)
            .setTopLeftCorner(CornerFamily.ROUNDED, topRadius)
            .setBottomLeftCorner(CornerFamily.ROUNDED, topRadius)
            .build()

        myShapeableImageView4.shapeAppearanceModel = myShapeableImageView.shapeAppearanceModel
            .toBuilder()
            .setTopLeftCorner(CornerFamily.ROUNDED, topRadius)
            .setBottomRightCorner(CornerFamily.ROUNDED, topRadius)
            .setTopRightCorner(CornerFamily.ROUNDED, 0f)
            .setBottomLeftCorner(CornerFamily.ROUNDED, 0f)
            .build()

        myShapeableImageView5.shapeAppearanceModel = myShapeableImageView.shapeAppearanceModel
            .toBuilder()
            .setTopLeftCorner(CornerFamily.ROUNDED, 0f)
            .setBottomRightCorner(CornerFamily.ROUNDED, 0f)
            .setTopRightCorner(CornerFamily.ROUNDED, topRadius)
            .setBottomLeftCorner(CornerFamily.ROUNDED, topRadius)
            .build()

        val topRadius20 = resources.getDimension(R.dimen.corner_radius20)

        myShapeableImageView6.shapeAppearanceModel = myShapeableImageView.shapeAppearanceModel
            .toBuilder()
            .setTopLeftCorner(CornerFamily.ROUNDED, 0f)
            .setBottomRightCorner(CornerFamily.ROUNDED, topRadius20)
            .setTopRightCorner(CornerFamily.ROUNDED, topRadius20)
            .setBottomLeftCorner(CornerFamily.ROUNDED, 0f)
            .build()

    }
}

