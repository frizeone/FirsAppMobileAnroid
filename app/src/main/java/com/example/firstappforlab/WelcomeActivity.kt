//package com.example.firstappforlab
//
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import androidx.appcompat.app.AppCompatActivity
//
//class WelcomeActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_welcome)
//
//        val btnGoToSignIn = findViewById<Button>(R.id.btnGoToSignIn)
//        btnGoToSignIn.setOnClickListener {
//            // Переход на экран авторизации
//            val intent = Intent(this, SignInActivity::class.java)
//            startActivity(intent)
//        }
//    }
//}
