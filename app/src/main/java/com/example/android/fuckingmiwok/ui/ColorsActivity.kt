package com.example.android.fuckingmiwok.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.fuckingmiwok.R
import com.example.android.fuckingmiwok.adapter.Adapter
import com.example.android.fuckingmiwok.model.WordModel

class ColorsActivity : AppCompatActivity() {

    private lateinit var title : TextView
    private lateinit var rvColors : RecyclerView

    private val colorsData : MutableList<WordModel> = mutableListOf(
        WordModel("weiss", "branco"),
        WordModel("schwarz", "preto"),
        WordModel("grau", "cinza"),
        WordModel("rot", "vermelho"),
        WordModel("blau", "azul"),
        WordModel("grün", "verde"),
        WordModel("gelb", "amarelo"),
        WordModel("orange", "laranja"),
        WordModel("rosa", "rosa"),
        WordModel("lila", "lilás"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

        initViews()
        showColors()
    }

    private fun initViews() {
        title = findViewById(R.id.colors_page_title)
        rvColors = findViewById(R.id.colors_recycler)
    }

    private fun showColors() {
        title.text = getString(R.string.colors)
        rvColors.adapter = Adapter(colorsData)
    }
}