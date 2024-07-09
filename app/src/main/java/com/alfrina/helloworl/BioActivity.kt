package com.alfrina.helloworl

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.alfrina.helloworl.databinding.ActivityBioBinding

class BioActivity : AppCompatActivity() {


    private lateinit var binding: ActivityBioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        }
    }
