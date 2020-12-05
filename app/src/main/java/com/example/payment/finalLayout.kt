package com.example.payment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class finalLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_layout)

            var intent = intent

      val benName = intent.getStringExtra("Name: ")
        val benAdd = intent.getStringExtra("Address")
        val benAcc = intent.getStringExtra("Account Number: ")
        val bawName = intent.getStringExtra("Name")
        val bawAdd = intent.getStringExtra("Address: ")
        val bawAcc = intent.getStringExtra("Account Number: ")
        val benpym = intent.getStringExtra("Payment:")
        val bawpym = intent.getStringExtra("Payment: ")

        val finalName= findViewById<TextView>(R.id.finalName)
        if(benName == null){
            finalName.text = "Name: \n"+bawName+"\nAddress: \n"+bawAdd+"\nAccount Number: \n"+bawAcc+"\nPayment: \n"+bawpym
        }
        else{
            finalName.text = "Name: \n"+benName+"\nAddress: \n"+benAdd+"\nAccount Number: \n"+benAcc+"\nPayment: \n"+benpym
        }

    }
}