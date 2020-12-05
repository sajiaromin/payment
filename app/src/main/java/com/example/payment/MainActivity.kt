package com.example.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(R.layout.activity_pay_bills)
        val op1 = findViewById<TextView>(R.id.textView)
        val op2 = findViewById<TextView>(R.id.textView2)

        val namee = findViewById<EditText>(R.id.fn)
        val neym1 = findViewById<EditText>(R.id.bawfn)
        val add = findViewById<EditText>(R.id.addr)
        val add1 = findViewById<EditText>(R.id.bawadd)
        val acc = findViewById<EditText>(R.id.accnum)
        val acc1 = findViewById<EditText>(R.id.bawacc)
        val pym = findViewById<Spinner>(R.id.spinner2)

        op1.setOnClickListener {
            val benName = namee?.text.toString()
            val benAdd = add?.text.toString()
            val benAcc = acc?.text.toString()
            val benpym = pym?.getSelectedItem().toString()

            val intent= Intent(this, benecoForm::class.java)
            intent.putExtra("Name:", benName)
            intent.putExtra("Address: ", benAdd)
            intent.putExtra("Account Number: ", benAcc)
            intent.putExtra("Payment: ", benpym)

            startActivity(intent)
        }
        op2.setOnClickListener {
            val bawName = neym1?.text.toString()
            val bawAdd = add1?.text.toString()
            val bawAcc = acc1?.text.toString()
            val bawpym = pym?.getSelectedItem().toString()
            val intent = Intent(this, bawadiForm::class.java)
            intent.putExtra("Name:", bawName)
            intent.putExtra("Address: ", bawAdd)
            intent.putExtra("Account Number: ", bawAcc)
            intent.putExtra("Payment: ", bawpym)
            startActivity(intent)

        }
    }
}