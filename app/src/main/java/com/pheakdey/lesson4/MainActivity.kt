package com.pheakdey.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAdd.setOnClickListener {
            val androidVersion = etAndroidVersion.text
            val androidCode = etAndroidCodeName.text

            Toast.makeText(this, androidVersion, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, androidCode, Toast.LENGTH_SHORT).show()

            // create a ne table row
            val tableRow = TableRow(applicationContext)

            //set new tble row layout parameters
            val layoutRarams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutRarams

            //add values into row by calling addView()
            //tableRow.addVi

        }




    }
}