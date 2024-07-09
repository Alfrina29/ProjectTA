package com.alfrina.helloworl.ui.theme

import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.alfrina.helloworl.R
import com.alfrina.helloworl.databinding.ActivityCacaBinding

class CacaActivity : AppCompatActivity() {


    private lateinit var binding: ActivityCacaBinding

   // private val arrayOfRandom = arrayOf("Susu")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCacaBinding.inflate(layoutInflater)
        setContentView(binding.root)

       setupText()

    }

    private fun setupText(){
        binding.button.setOnClickListener{
            binding.textView2.visibility = View.VISIBLE
            val value = binding.editTextText.text
            binding.textView2.text = value

//            kita mau ubah titel inptan user

            binding.textView.text=value
        }
    }


}