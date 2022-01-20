package com.example.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private  var tvSelectedDate : TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker: Button = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)

        btnDatePicker.setOnClickListener {

            clickDatePicker()

        }

    }
    fun clickDatePicker(){
        //Initialize variables for DatePickerDialog()
        val mycalender = Calendar.getInstance()
        val year = mycalender.get(Calendar.YEAR)
        val month = mycalender.get(Calendar.MONTH)
        val day = mycalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener { view , selecedyear,  selectedmonth, selecteddayofMonth  ->
                Toast.makeText(this, "Date worked $selecedyear ${selectedmonth+1} $selecteddayofMonth",Toast.LENGTH_SHORT).show()
            },
            year,
            month,
            day
        ).show()


        //Toast.makeText(this, "button date picker displayed",Toast.LENGTH_SHORT).show()
    }


}