package com.example.lab02_taxonomia_generaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVerificationButton.setOnClickListener {

            var yearOfBirth = edtYearOfBirth.text.toString().toInt()

            tvPopulationNumber.text = when(yearOfBirth) {
                in 1969 .. 1980 -> {
                    "GENERACIÓN X"
                }
                in 1981 .. 1993 -> {
                    "GENERACIÓN Y"
                }
                in 1994 .. 2010 -> {
                    "GENERACIÓN Z"
                } else -> {
                    "No perteneces a ninguna generación"
                }
            }

        }

    }
}