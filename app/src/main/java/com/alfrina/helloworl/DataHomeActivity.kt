package com.alfrina.helloworl

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.alfrina.helloworl.databinding.ActivityDataHomeBinding

class DataHomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDataHomeBinding

   // private val arrayofRandom = arrayOf("Susu","Jahe", "Kopi")
   // private val arrayData = arrayOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hitungBerat()
        }

    private fun hitungBerat(){
        binding.calculateButton.setOnClickListener {
            val heightStr = binding.heightInput.text.toString()
            val weightStr = binding.weightInput.text.toString()

            if (heightStr.isNotEmpty() && weightStr.isNotEmpty()) {
                val height = heightStr.toFloat() / 100 // convert to meters
                val weight = weightStr.toFloat()

                val bmi = weight / (height * height)
                val result = when {
                    bmi < 18.5 -> "Underweight"
                    bmi in 18.5..24.9 -> "Normal weight"
                    bmi in 25.0..29.9 -> "Overweight"
                    else -> "Obese"
                }

                binding.resultText.text = "BMI: %.2f\n%s".format(bmi, result)
            } else {
               binding.resultText.text = "Please enter valid height and weight"
            }
        }
    }
    }
    }
