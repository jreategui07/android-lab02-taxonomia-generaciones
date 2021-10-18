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

            when(yearOfBirth) {
                in 1930 .. 1948 -> {
                    tvPopulationNumber.text = "6.300.000"
                    tvCharacteristicFeature.text = "Austeridad"
                }
                in 1949 .. 1968 -> {
                    tvPopulationNumber.text = "12.200.000"
                    tvCharacteristicFeature.text = "Ambición"
                }
                in 1969 .. 1980 -> {
                    tvPopulationNumber.text = "9.300.000"
                    tvCharacteristicFeature.text = "Obsesión por el éxito"
                }
                in 1981 .. 1993 -> {
                    tvPopulationNumber.text = "7.200.000"
                    tvCharacteristicFeature.text = "Frustración"
                }
                in 1994 .. 2010 -> {
                    tvPopulationNumber.text = "7.800.000"
                    tvCharacteristicFeature.text = "Irreverencia"
                } else -> {
                    tvPopulationNumber.text = "No se encontraron resultados"
                    tvCharacteristicFeature.text = "No se encontraron resultados"
                }
            }

        }

    }
}