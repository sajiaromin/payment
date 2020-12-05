package com.example.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bawadiForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bawadi_form)

        //var intent = intent
        val butt = findViewById<Button>(R.id.bawbut)

        butt.setOnClickListener{
            val bawName = intent.getStringExtra("Name")
            val bawAdd = intent.getStringExtra("Address: ")
            val bawAcc = intent.getStringExtra("Account Number: ")
            val bawpym = intent.getStringExtra("Payment: ")

            val intent = Intent(this, paymentForm::class.java)
            intent.putExtra("Name:", bawName)
            intent.putExtra("Address: ", bawAdd)
            intent.putExtra("Account Number: ", bawAcc)
            intent.putExtra("Payment: ", bawpym)
            startActivity(intent)


        }
    }

}