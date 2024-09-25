package com.example.firstappforlab

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class OnboardActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var btnNext: Button
    private lateinit var btnPrevious: Button
    private lateinit var adapter: OnboardAdapter
    private val onboardItems = listOf(
        OnboardItem("Welcome", "This is our awesome app", R.drawable.onboard_image1),
        OnboardItem("Feature 1", "We offer amazing feature 1", R.drawable.onboard_image2),
        OnboardItem("Feature 2", "Don't miss out on feature 2", R.drawable.onboard_image3)
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        viewPager = findViewById(R.id.viewPager)
        btnNext = findViewById(R.id.btnNext)
        btnPrevious = findViewById(R.id.btnPrevious)

        adapter = OnboardAdapter(onboardItems)
        viewPager.adapter = adapter

        btnNext.setOnClickListener {
            if (viewPager.currentItem < adapter.itemCount - 1) {
                viewPager.currentItem += 1
            } else {
                // Переход на SignInActivity
                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        btnPrevious.setOnClickListener {
            if (viewPager.currentItem > 0) {
                viewPager.currentItem -= 1
            }
        }
    }
}
