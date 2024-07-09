package com.alfrina.helloworl

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alfrina.helloworl.databinding.ActivityHomePageBinding

class HomePageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ClickSubmit()
        }



    fun ClickSubmit(){
        binding.buttonSubmit.setOnClickListener{
            if(binding.nama.text.isEmpty() or
                binding.umur.text.isEmpty() or
                binding.checkBoxAgreement.isChecked){
                binding.warning.text = "Wajib di isi semua ya!!"
            }else{
                val intent = Intent(this, DataHomeActivity::class.java)
                startActivity(intent)
            }
        }

    }
    }
