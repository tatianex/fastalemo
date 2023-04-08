package com.example.android.fuckingmiwok.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.android.fuckingmiwok.R

class MainActivity : AppCompatActivity() {

    private lateinit var numbers: TextView
    private lateinit var family: TextView
    private lateinit var colors: TextView
    private lateinit var phrases: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initListeners()
    }

    private fun initViews() {
        numbers = findViewById(R.id.numbers)
        family = findViewById(R.id.family)
        colors = findViewById(R.id.colors)
        phrases = findViewById(R.id.phrases)
    }

    private fun initListeners() {
        numbers.setOnClickListener {
            startNumbersActivity()
        }
        family.setOnClickListener {
            startFamilyActivity()
        }
        colors.setOnClickListener {
            startColorsActivity()
        }
        phrases.setOnClickListener {
            startPhrasesActivity()
        }
    }

    private fun startNumbersActivity() {
        val intent = Intent(this, NumbersActivity::class.java)
        startActivity(intent)
    }

    private fun startFamilyActivity() {
        val intent = Intent(applicationContext, FamilyActivity::class.java)
        startActivity(intent)
    }

    private fun startColorsActivity() {
        val intent = Intent(applicationContext, ColorsActivity::class.java)
        startActivity(intent)
    }

    private fun startPhrasesActivity() {
        val intent = Intent(applicationContext, PhrasesActivity::class.java)
        startActivity(intent)
    }
}