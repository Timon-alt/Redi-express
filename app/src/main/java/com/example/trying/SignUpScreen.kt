package com.example.trying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.trying.databinding.ActivitySignInScreenBinding
import com.example.trying.databinding.ActivitySignUpScreenBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class SignUpScreen() : AppCompatActivity() {

    private var supabase: Supabase = Supabase()

    lateinit var binding: ActivitySignUpScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.button.isEnabled = true
        }



//        val password = binding.plainPass.text.toString()
//        val repass = binding.plainRePass.text.toString()
//
//        binding.btnLogin.setOnClickListener {
//            lifecycleScope.launch {
//                check(password, repass)
//            }
//        }
//    }
//
//     suspend fun check(password: String, repass: String) {
//        val supabase = Supabase()
//        val emailText = binding.plainEmail.text
//        val passText = binding.plainPass.text


//        if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches())
//        {
//            Toast.makeText(applicationContext, "Invalid email", Toast.LENGTH_SHORT).show()
//        }
//
//        if (password == repass && Patterns.EMAIL_ADDRESS.matcher(emailText).matches())
//        {
//            Toast.makeText(applicationContext, "Succsesfuly", Toast.LENGTH_SHORT).show()
//
//            supabase.insertUser(emailText.toString(), passText.toString())
//        }
    }
}