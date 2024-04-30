package com.example.Multiplicationtable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.multiplicationtable.Multiplication_Table
import com.example.multiplicationtable.R

class MainActivity : AppCompatActivity() {

    // Declare variables
    private lateinit var multiplyButton: Button
    private lateinit var tableNumberEditText: EditText
    private lateinit var multiplicationTableTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views based on IDs
        multiplyButton = findViewById(R.id.multiplyButton)
        tableNumberEditText = findViewById(R.id.tableNumberEditText)
        multiplicationTableTextView = findViewById(R.id.multiplicationTableTextView)

        // Set onClicklistener for the multiplyButton
        multiplyButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, Multiplication_Table::class.java)
            // start the activty
            startActivity(intent)
            // add the table number to the intent
            intent.putExtra("tableNumber", tableNumberEditText.text.toString() )
            // start your next activity
            startActivity(intent)
        }
    }
}