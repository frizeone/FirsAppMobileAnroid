//package com.example.firstappforlab
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//
//class RegisterActivity : AppCompatActivity() {
//
//
//    private val userList = mutableListOf<User>()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register)
//
//        val emailField = findViewById<EditText>(R.id.email)
//        val passwordField = findViewById<EditText>(R.id.password)
//        val registerButton = findViewById<Button>(R.id.btnRegister)
//
//        registerButton.setOnClickListener {
//            val email = emailField.text.toString()
//            val password = passwordField.text.toString()
//
//            if (email.isNotEmpty() && password.isNotEmpty()) {
//
//                val newUser = User(id = userList.size + 1, email = email, password = password)
//                userList.add(newUser)
//
//                Toast.makeText(this, "Регистрация прошла успешно!", Toast.LENGTH_SHORT).show()
//
//
//                val intent = Intent(this, SignInActivity::class.java)
//
//                intent.putParcelableArrayListExtra("userList", ArrayList(userList))
//                startActivity(intent)
//                finish()
//            } else {
//                Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//}
