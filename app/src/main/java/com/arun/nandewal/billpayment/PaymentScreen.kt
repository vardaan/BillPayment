package com.arun.nandewal.billpayment

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class PaymentScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_screen)
        supportActionBar?.title = "Payment screen"
        findViewById<View>(R.id.container).setOnClickListener { moveToPaymentScreen() }
    }

    fun moveToPaymentScreen() {
        val intent = Intent(this, SuccessActivity::class.java)
        startActivity(intent)
    }

}
