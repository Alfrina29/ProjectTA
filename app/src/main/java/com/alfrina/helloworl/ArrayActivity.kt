package com.alfrina.helloworl

import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.alfrina.helloworl.databinding.ActivityArrayBinding

class ArrayActivity : AppCompatActivity() {


    private lateinit var binding: ActivityArrayBinding
    private val arrayOfRandom  = arrayOf("Susu", "Jus", "Jahe")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArrayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListView()
    }

    private fun setupListView(){
        val adapter = ArrayAdapter(this, R.layout.sample_list_item, R.id.textView3, arrayOfRandom)

        binding.sampleListView.adapter = adapter    }
}