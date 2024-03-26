package com.example.trying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.trying.databinding.ActivitySignInScreenBinding

class SignInScreen : AppCompatActivity() {

    lateinit var binding: ActivitySignInScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    private fun check(password: String) {

    }
}