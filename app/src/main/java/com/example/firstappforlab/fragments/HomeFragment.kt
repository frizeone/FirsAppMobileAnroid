package com.example.firstappforlab.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstappforlab.Chat
import com.example.firstappforlab.ChatAdapter
import com.example.firstappforlab.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val chats = listOf(
            Chat("Alice", "Hello!", "12:00"),
            Chat("Bob", "How are you?", "11:30"),
            Chat("Charlie", "See you soon", "10:45")
        )

        val adapter = ChatAdapter(chats)
        recyclerView.adapter = adapter

        return view
    }
}
