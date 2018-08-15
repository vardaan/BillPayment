package com.arun.nandewal.billpayment

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Select Account Type"
        findViewById<View>(R.id.coporate).setOnClickListener {openMapScreen()}
        findViewById<View>(R.id.personal).setOnClickListener {openMapScreen()}
        findViewById<View>(R.id.rental).setOnClickListener {openMapScreen()}

    }

    fun openMapScreen() {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }
}
