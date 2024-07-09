package com.alfrina.helloworl

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alfrina.helloworl.databinding.ActivityProjectBinding

class ProjectActivity : AppCompatActivity() {

    private lateinit var binding : ActivityProjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Submit()

    }

    fun Submit(){
        binding.button.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }
    }
}