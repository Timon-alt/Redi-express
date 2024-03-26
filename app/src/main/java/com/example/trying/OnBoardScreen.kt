package com.example.trying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trying.databinding.ActivityOnBoardScreenBinding

class OnBoardScreen : AppCompatActivity() {

    lateinit var binding: ActivityOnBoardScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOnBoardScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignIn.setOnClickListener {
            startActivity(Intent(this, SignInScreen::class.java))
        }

        binding.btnSignUp.setOnClickListener {
            startActivity(Intent(this, SignUpScreen::class.java))
        }

        binding.btnOTP.setOnClickListener {
            startActivity(Intent(this, OTPVerification::class.java))
        }
    }
}