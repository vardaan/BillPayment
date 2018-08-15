package com.arun.nandewal.billpayment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val animView = findViewById<LottieAnimationView>(R.id.animation_view)
        animView.repeatCount = 3
        Handler().postDelayed({ openMapScreen() }, 4000)
    }

    fun openMapScreen() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
