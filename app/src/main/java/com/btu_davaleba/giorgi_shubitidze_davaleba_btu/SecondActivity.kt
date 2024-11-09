package com.btu_davaleba.giorgi_shubitidze_davaleba_btu

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.btu_davaleba.giorgi_shubitidze_davaleba_btu.databinding.ActivityMainBinding
import com.btu_davaleba.giorgi_shubitidze_davaleba_btu.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        enableEdgeToEdge()
        setContentView(view)

        var displayNum = intent.getIntExtra("number", 0)

        binding.tvDisplayNumber.text = displayNum.toString()

        binding.btnIncrease.setOnClickListener {
            displayNum--
            binding.tvDisplayNumber.text = displayNum.toString()
        }

    }
}