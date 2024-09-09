package com.example.loginapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput=findViewById(R.id.username_input)
        passwordInput=findViewById(R.id.password_input)
        loginBtn=findViewById(R.id.login_btn)

        loginBtn.setOnClickListener { it:View }
        val username = usernameInput.text.toString()
        val password = passwordInput.text.toString()
        log.i(tag:"test Credentials", msg: "username$username and password : $password")
                }
    }
}