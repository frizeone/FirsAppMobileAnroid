package com.example.firstappforlab.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.firstappforlab.MainActivity
import com.example.firstappforlab.OnboardAdapter
import com.example.firstappforlab.OnboardItem
import com.example.firstappforlab.R

class OnboardFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    private lateinit var btnNext: Button
    private lateinit var btnPrevious: Button

    private val onboardItems = listOf(
        OnboardItem("Welcome", "This is our awesome app", R.drawable.onboard_image1),
        OnboardItem("Feature 1", "We offer amazing feature 1", R.drawable.onboard_image2),
        OnboardItem("Feature 2", "Don't miss out on feature 2", R.drawable.onboard_image3)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_onboard, container, false)

        viewPager = view.findViewById(R.id.viewPager)
        btnNext = view.findViewById(R.id.btnNext)
        btnPrevious = view.findViewById(R.id.btnPrevious)

        val adapter = OnboardAdapter(onboardItems)
        viewPager.adapter = adapter

        btnNext.setOnClickListener {
            if (viewPager.currentItem < adapter.itemCount - 1) {
                viewPager.currentItem += 1
            } else {
                (activity as MainActivity).navigateToSignIn()
            }
        }

        btnPrevious.setOnClickListener {
            if (viewPager.currentItem > 0) {
                viewPager.currentItem -= 1
            }
        }

        return view
    }
}
