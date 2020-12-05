package com.example.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.core.view.isGone
import org.w3c.dom.Text
import kotlin.math.exp
import android.widget.ArrayAdapter as ArrayAdapter1

class paymentForm : AppCompatActivity() {

    lateinit var option: Spinner
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_form)

        //var intent = intent

        option = findViewById(R.id.spinner2) as Spinner
        result = findViewById(R.id.paymopt) as TextView

        val final = findViewById<Button>(R.id.finalBut)
        val expm = findViewById<EditText>(R.id.expmon)
        val expy = findViewById<EditText>(R.id.expyr)
        val tit1 = findViewById<TextView>(R.id.textView14)
        val tit2 = findViewById<TextView>(R.id.textView15)

        val neym = findViewById<EditText>(R.id.benfn)
        val neym1 = findViewById<EditText>(R.id.bawfn)
        val add = findViewById<EditText>(R.id.benadd)
        val add1 = findViewById<EditText>(R.id.bawadd)
        val acc = findViewById<EditText>(R.id.benacc)
        val acc1 = findViewById<EditText>(R.id.bawacc)
        val pym = findViewById<Spinner>(R.id.spinner2)

        var options = arrayOf("Choose an option", "Gcash", "MasterCard")
        option.adapter = ArrayAdapter1<String>(this, android.R.layout.simple_list_item_1, options)
        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val selectedItem = parent?.getItemAtPosition(p2).toString()
                if (selectedItem == "Gcash") {
                    expm.visibility = View.INVISIBLE


                } else {
                    expm.visibility = View.VISIBLE
                }


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

        final.setOnClickListener {
            /* val benName = neym.text.toString()
     val benAdd = add.text.toString()
     val benAcc = acc.text.toString()
     val benpym = pym.getSelectedItem().toString()

     val bawName = neym1.text.toString()
     val bawAdd = add1.text.toString()
     val bawAcc = acc1.text.toString()
     val bawpym = pym.getSelectedItem().toString()

     val intent = Intent(this@paymentForm, finalLayout::class.java)
     intent.putExtra("Name:", benName)
     intent.putExtra("Address: ", benAdd)
     intent.putExtra("Account Number: ", benAcc)
    intent.putExtra("Payment: ", benpym)
     intent.putExtra("Name:", bawName)
     intent.putExtra("Address: ", bawAdd)
     intent.putExtra("Account Number: ", bawAcc)
     intent.putExtra("Payment: ", bawpym)

     startActivity(intent)
      */
        }
    }
        }









