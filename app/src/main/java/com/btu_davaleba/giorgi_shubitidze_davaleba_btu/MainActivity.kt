package com.btu_davaleba.giorgi_shubitidze_davaleba_btu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.btu_davaleba.giorgi_shubitidze_davaleba_btu.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        enableEdgeToEdge()
        setContentView(view)


        binding.btnOkay.setOnClickListener {
            val enteredNum = binding.etInput.text.toString()
            if(!enteredNum.isNullOrEmpty() && enteredNum.toIntOrNull() != null ) {
                binding.tvYourNumber.text = "your number is $enteredNum"
            }
            else{
                Toast.makeText(this,"Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnNext.setOnClickListener {
            val enteredNum = binding.etInput.text.toString()
            if(!enteredNum.isNullOrEmpty() && enteredNum.toIntOrNull() != null ) {
                val intent = Intent(this, SecondActivity::class.java)
                    .putExtra("number",enteredNum.toInt())
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        }


    }
}