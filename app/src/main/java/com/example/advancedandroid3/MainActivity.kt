package com.example.advancedandroid3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedandroid3.databinding.ActivityAddBinding
import com.example.advancedandroid3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            button.setOnClickListener {
                var name = nameEditText.text.toString()
                var email = emailEditText.text.toString()
                var number = numberEditText.text.toString()

                var intent = Intent(this@MainActivity, AddActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("email", email)
                intent.putExtra("number", number)
                startActivity(intent)
                finish()
            }
        }



    }

}