package com.example.trying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import com.example.trying.databinding.ActivityOtpverificationBinding

class OTPVerification : AppCompatActivity() {

    lateinit var binding: ActivityOtpverificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOtpverificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inputCode1.addTextChangedListener() {

        }
    }
}