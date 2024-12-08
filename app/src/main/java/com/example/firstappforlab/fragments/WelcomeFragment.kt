package com.example.firstappforlab.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.firstappforlab.MainActivity
import com.example.firstappforlab.R

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        val btnGoToSignIn = view.findViewById<Button>(R.id.btnGoToSignIn)
        btnGoToSignIn.setOnClickListener {
            // Используем метод навигации в MainActivity для перехода на экран авторизации
            (activity as MainActivity).navigateToSignIn()
        }

        return view
    }
}
