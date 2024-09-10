package com.example.login

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.email.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_NEXT) {
                binding.fullname.requestFocus()
                true
            } else {
                false
            }
        }

        binding.signUpButton.setOnClickListener {
            val emailInput = binding.email.text.toString()
            val nameInput = binding.fullname.text.toString()
            val userInput = binding.username.text.toString()
            val passwordInput = binding.password.text.toString()

            // Display a Toast with the input
            if (emailInput.isNotEmpty()) {
                Toast.makeText(this, "Email: $emailInput", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter an email", Toast.LENGTH_SHORT).show()
            }
            if (nameInput.isNotEmpty()) {
                Toast.makeText(this, "Full Name: $nameInput", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
            }
            if (userInput.isNotEmpty()) {
                Toast.makeText(this, "User Name: $userInput", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter a username", Toast.LENGTH_SHORT).show()
            }
            if (passwordInput.isNotEmpty()) {
                Toast.makeText(this, "Password: $passwordInput", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter a password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
