package com.pheakdey.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.marginLeft
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAdd.setOnClickListener {
            val androidVersion = etAndroidVersion.text
            val androidCode = etAndroidCodeName.text

            val textAndroidVersion = TextView(this)
            textAndroidVersion.text = androidVersion
            textAndroidVersion.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)
            //textAndroidVersion.setPadding(0,0,500,0)

            val textAndroidCode = TextView(this)
            textAndroidCode.text = androidCode
            textAndroidCode.setPadding(280,0,0,0)
            textAndroidCode.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)

            Toast.makeText(this, androidVersion, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, androidCode, Toast.LENGTH_SHORT).show()

            // create a ne table row
            val tableRow = TableRow(applicationContext)

            //set new tble row layout parameters
            val layoutRarams = TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT)
            tableRow.layoutParams = layoutRarams

            //add values into row by calling addView()
            tableRow.addView(textAndroidVersion)
            tableRow.addView(textAndroidCode)

            table_main.addView(tableRow)

        }




    }
}