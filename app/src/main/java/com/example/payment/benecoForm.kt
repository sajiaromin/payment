package com.example.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class benecoForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //var intent = intent

        val n = findViewById<Button>(R.id.benbut)

        n.setOnClickListener(){
            val benName = intent.getStringExtra("Name: ")
            val benAdd = intent.getStringExtra("Address")
            val benAcc = intent.getStringExtra("Account Number: ")
            val benpym = intent.getStringExtra("Payment: ")


            val intent = Intent(this, paymentForm::class.java )
            intent.putExtra("Name:", benName)
            intent.putExtra("Address: ", benAdd)
            intent.putExtra("Account Number: ", benAcc)
            intent.putExtra("Payment: ", benpym)

            startActivity(intent)
        }

    }
}