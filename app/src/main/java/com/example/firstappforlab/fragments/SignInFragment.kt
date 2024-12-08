package com.example.firstappforlab.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.firstappforlab.MainActivity
import com.example.firstappforlab.R
import com.example.firstappforlab.User

class SignInFragment : Fragment() {

    private var userList: ArrayList<User> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        val emailField = view.findViewById<EditText>(R.id.email)
        val passwordField = view.findViewById<EditText>(R.id.password)
        val signInButton = view.findViewById<Button>(R.id.btnSignIn)
        val registerButton = view.findViewById<Button>(R.id.btnRegister)

        signInButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()
            val user = userList.find { it.email == email && it.password == password }

            if (user != null) {
                (activity as MainActivity).navigateToHome()
            } else {
                Toast.makeText(requireContext(), "Неверные данные", Toast.LENGTH_SHORT).show()
            }
        }

        registerButton.setOnClickListener {
            (activity as MainActivity).navigateToRegister()
        }

        return view
    }
}
