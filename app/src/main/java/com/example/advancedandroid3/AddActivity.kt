package com.example.advancedandroid3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedandroid3.databinding.ActivityAddBinding
import com.example.advancedandroid3.databinding.ActivityMainBinding

class AddActivity : AppCompatActivity() {
    val binding by lazy { ActivityAddBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            var name = intent.extras?.getString("name")?: "Error"
            var email = intent.extras?.getString("email")?: "Error"
            var number = intent.extras?.getString("number")?: "Error"

            addButton.setOnClickListener {
                var age = ageEditText.text.toString().toInt()
                var intent = Intent(this@AddActivity, ResultAcitivty::class.java)
                intent.putExtra("name", name)
                intent.putExtra("email", email)
                intent.putExtra("number", number)
                intent.putExtra("age", age)
                startActivity(intent)
            }
        }
    }
}