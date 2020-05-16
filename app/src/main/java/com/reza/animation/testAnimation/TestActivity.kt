package com.reza.animation.testAnimation

import android.animation.*
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.reza.animation.R

class TestActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val t = findViewById<View>(R.id.launch) as TextView

        //ValueAnimator scaleX  translationX    alpha   rotation    rotationX   backgroundColor
        //ofFloat   ofInt   ofObject
        val valueAnimatorTranslationY = ValueAnimator.ofFloat(0f, -300f)
        valueAnimatorTranslationY.addUpdateListener {
            val value = it.animatedValue as Float
            t.translationY = value
        }
        valueAnimatorTranslationY.interpolator = LinearInterpolator()
        valueAnimatorTranslationY.duration = 2000
//        valueAnimatorTranslationY.start()


        val valueAnimatorRotation = ValueAnimator.ofFloat(0f, 360f)
        valueAnimatorRotation.addUpdateListener {
            val value = it.animatedValue as Float
            t.rotation = value
        }
        valueAnimatorRotation.interpolator = AccelerateInterpolator(1.5f)
        valueAnimatorRotation.duration = 2000
//        valueAnimatorRotation.start()


        // ObjectAnimator
        val objectAnimatorTranslationY = ObjectAnimator.ofFloat(t, "translationY", 0f, 300f)
        objectAnimatorTranslationY.duration = 2000
//        objectAnimatorTranslationY.start()

        val objectAnimatorBackgroundColor = ObjectAnimator.ofObject(
                t,
                "backgroundColor",
                ArgbEvaluator(),
                ContextCompat.getColor(this, R.color.colorPrimary),
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
        )
        objectAnimatorBackgroundColor.repeatCount = 1
        objectAnimatorBackgroundColor.repeatMode = ValueAnimator.REVERSE
        objectAnimatorBackgroundColor.duration = 2000
        objectAnimatorBackgroundColor.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {}
            override fun onAnimationEnd(animation: Animator?) {}
            override fun onAnimationCancel(animation: Animator?) {}
            override fun onAnimationStart(animation: Animator?) {} })
//        objectAnimatorBackgroundColor.start()


        val animatorSet = AnimatorSet()
//        animatorSet.play(valueAnimatorTranslationY).after(valueAnimatorRotation)//first valueAnimatorRotation then valueAnimatorTranslationY
//        animatorSet.play(valueAnimatorTranslationY).before(valueAnimatorRotation).after(objectAnimatorBackgroundColor) //color translate rotate
        animatorSet.playSequentially(valueAnimatorTranslationY,objectAnimatorBackgroundColor,objectAnimatorTranslationY,valueAnimatorRotation)
//        animatorSet.playTogether(valueAnimatorTranslationY,objectAnimatorBackgroundColor,objectAnimatorTranslationY,valueAnimatorRotation)
        animatorSet.duration = 2000
        animatorSet.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
                Toast.makeText(applicationContext, "onAnimationStart", Toast.LENGTH_SHORT)
                        .show()
            }

            override fun onAnimationEnd(animation: Animator) {
                Toast.makeText(applicationContext, "onAnimationEnd", Toast.LENGTH_SHORT)
                        .show()
                finish()
            }

            override fun onAnimationCancel(animation: Animator) {
                Toast.makeText(applicationContext, "onAnimationCancel", Toast.LENGTH_SHORT)
                        .show()
            }

            override fun onAnimationRepeat(animation: Animator) {
                Toast.makeText(applicationContext, "onAnimationRepeat", Toast.LENGTH_SHORT)
                        .show()
            }
        })
//        animatorSet.start()

        t.animate()
                .translationY(-300f)
                .rotationBy(360f)
                .setDuration(3000)
                .start()

    }
}