package com.example.multiplicationtable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Multiplication_Table : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_table)

        // get the table number from the bundle
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        // convert the table to an integer
        val tableNumber = tableString!!.toInt()

        val multiplicationTable = findViewById<TextView>(R.id.multiplicationTableTextView)

        // start with the heading and add two new lines
        var tableDisplay: String = "$tableNumber × table＼n＼n"

        // loop 10 times and keep adding to the string

        // set the string onto the display
        multiplicationTable.text = tableDisplay

        // declare the control variables
        var counter = 1
        while (counter <= 10) { // check the control variable
            // skip 3
            if (counter == 3) {
                counter++
                continue
            }
            val answer = tableNumber * counter
            tableDisplay += "$tableNumber × $counter = ${answer}＼n"
            counter++ // update the control variables
        }
    }
}