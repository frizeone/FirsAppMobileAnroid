package com.example.firstappforlab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.firstappforlab.fragments.RegisterFragment
import com.example.firstappforlab.fragments.SignInFragment

class MainActivity : AppCompatActivity() {

    lateinit var sharedViewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализация ViewModel
        sharedViewModel = ViewModelProvider(this).get(SharedViewModel::class.java)

        // Открываем экран авторизации при запуске
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SignInFragment())
                .commit()
        }
    }

    fun navigateToRegister() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RegisterFragment())
            .addToBackStack(null)
            .commit()
    }

    fun navigateToSignIn() {
        supportFragmentManager.popBackStack()
    }

    fun navigateToHome() {
        // Здесь можно открыть HomeFragment
    }
}
