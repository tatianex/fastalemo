package com.example.android.fuckingmiwok.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.android.fuckingmiwok.R
import com.example.android.fuckingmiwok.adapter.Adapter
import com.example.android.fuckingmiwok.model.WordModel


class NumbersActivity : AppCompatActivity() {

    private lateinit var title: TextView
    private lateinit var rvNumbers: RecyclerView

    private val numbersData : MutableList<WordModel> = mutableListOf(
        WordModel("eins", "um"),
        WordModel("zwei", "dois"),
        WordModel("drei", "três"),
        WordModel("vier", "quatro"),
        WordModel("fünf", "cinco"),
        WordModel("sechs", "seis"),
        WordModel("sieben", "sete"),
        WordModel("acht", "oito"),
        WordModel("neun", "nove"),
        WordModel("zehn", "dez"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

//        Log.v("numbersActivity" , "the word at index 0 is " + numbersData[0])
//        Log.v("numbersActivity" , "the word at index 1 is " + numbersData[1])
//        Log.v("numbersActivity" , "the word at index 2 is " + numbersData[2])
//        Log.v("numbersActivity" , "the word at index 3 is " + numbersData[3])
//        Log.v("numbersActivity" , "the word at index 4 is " + numbersData[4])
//        Log.v("numbersActivity" , "the word at index 5 is " + numbersData[5])
//        Log.v("numbersActivity" , "the word at index 6 is " + numbersData[6])
//        Log.v("numbersActivity" , "the word at index 7 is " + numbersData[7])
//        Log.v("numbersActivity" , "the word at index 8 is " + numbersData[8])
//        Log.v("numbersActivity" , "the word at index 9 is " + numbersData[9])
//
//        for (index in 0..2) {
//            Log.v("NumbersActivity", "Index:" + index + " Value:" + numbersData[index])
//        }

        initViews()
        showNumbers()
    }

    private fun initViews() {
        title = findViewById(R.id.numbers_page_title)
        rvNumbers = findViewById(R.id.numbers_recycler)
    }

    private fun showNumbers() {
//        var index = 0
//        while (index < words.size) {
//            val wordView = TextView(this)
//            wordView.text = words[index]
//            rootView.addView(wordView)
//            index++
//        }

//        for (number in numbers) {
//            val wordView = TextView(this)
//            wordView.text = number
//            rootView.addView(wordView)
//        }
        title.text = getString(R.string.the_numbers)
        rvNumbers.adapter = Adapter(numbersData)
    }
}