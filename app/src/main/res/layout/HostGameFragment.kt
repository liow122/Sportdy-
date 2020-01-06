package com.example.sportdy.Game

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sportdy.R
import kotlinx.android.synthetic.main.fragment_host_game.*
import java.util.*


class HostGameFragment : AppCompatActivity() {
    var datepicker: DatePickerDialog? = null
    var timepicker: TimePickerDialog? = null
    private var eTextDate: EditText? = null
    private var eTextTime: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eTextDate = findViewById<View>(R.id.editTextDate) as EditText
        eTextDate!!.inputType = InputType.TYPE_NULL
        eTextDate!!.setOnClickListener {
            val cldr = Calendar.getInstance()
            val day = cldr[Calendar.DAY_OF_MONTH]
            val month = cldr[Calendar.MONTH]
            val years = cldr[Calendar.YEAR]
            // date picker dialog
            datepicker = DatePickerDialog(
                this,
                OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                    eTextDate!!.setText(
                        dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + year
                    )
                }, years, month, day
            )
            datepicker!!.show()

        }

        eTextTime = findViewById<View>(R.id.editTextTime) as EditText
        eTextTime!!.inputType = InputType.TYPE_NULL
        eTextTime!!.setOnClickListener{
            val cldr = Calendar.getInstance()
            val currentHour: Int = cldr.get(Calendar.HOUR_OF_DAY)
            val currentMinute: Int = cldr.get(Calendar.MINUTE)
            var amPm: String

            timepicker = TimePickerDialog(this,
                OnTimeSetListener { _, hourOfDay, minute ->
                    amPm = if (hourOfDay>=12){
                        "PM"
                    }else {
                        "AM"
                    }
                    eTextTime!!.setText(String.format("%02d:%02d", hourOfDay, minute) + amPm)

                }, currentHour, currentMinute, false
            )
            timepicker!!.show()
        }
        editTextDescription.text.isNotEmpty().apply {
            Toast.makeText(applicationContext, "Please enter some description! ", Toast.LENGTH_SHORT).show()
        }
        editTextVenue.text.isNotEmpty().apply {
            Toast.makeText(applicationContext, "Invalid Address ", Toast.LENGTH_SHORT).show()
        }
    }

}