package com.example.firstappforlab.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.firstappforlab.MainActivity
import com.example.firstappforlab.R
import com.example.firstappforlab.SharedViewModel
import com.example.firstappforlab.User

class RegisterFragment : Fragment() {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        // Получаем ViewModel
        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        val emailField = view.findViewById<EditText>(R.id.email)
        val passwordField = view.findViewById<EditText>(R.id.password)
        val registerButton = view.findViewById<Button>(R.id.btnRegister)

        registerButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Создаем нового пользователя
                val newUser = User(
                    id = (sharedViewModel.userList.value?.size ?: 0) + 1,
                    email = email,
                    password = password
                )

                // Добавляем пользователя в ViewModel
                sharedViewModel.addUser(newUser)

                // Переход на экран авторизации
                Toast.makeText(requireContext(), "Регистрация прошла успешно!", Toast.LENGTH_SHORT).show()
                (activity as MainActivity).navigateToSignIn()
            } else {
                Toast.makeText(requireContext(), "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}
