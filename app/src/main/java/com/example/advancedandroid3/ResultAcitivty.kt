package com.example.advancedandroid3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedandroid3.databinding.ActivityAddBinding
import com.example.advancedandroid3.databinding.ActivityResultBinding

class ResultAcitivty : AppCompatActivity() {
    val binding by lazy { ActivityResultBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            nameTextView.text = intent.getStringExtra("name")?: "Error"
            mailTextView.text = intent.getStringExtra("email")?: "Error"
            numberTextView.text = intent.getStringExtra("number")?: "Error"
            ageTextView.text = intent.getIntExtra("age", 0).toString()?: "Error"
        }

    }
}