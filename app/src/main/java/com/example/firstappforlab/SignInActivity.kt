package com.example.firstappforlab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    // Список для хранения пользователей
    private var userList: ArrayList<User> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Получаем массив пользователей из RegisterActivity
        userList = intent.getParcelableArrayListExtra("userList") ?: arrayListOf()

        val emailField = findViewById<EditText>(R.id.email)
        val passwordField = findViewById<EditText>(R.id.password)
        val signInButton = findViewById<Button>(R.id.btnSignIn)
        val registerButton = findViewById<Button>(R.id.btnRegister)

        signInButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            val user = userList.find { it.email == email && it.password == password }

            if (user != null) {
                // Успешный вход
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Неверные данные", Toast.LENGTH_SHORT).show()
            }
        }

        // Кнопка для перехода на экран регистрации
        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
