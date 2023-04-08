package com.example.android.fuckingmiwok.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.fuckingmiwok.R
import com.example.android.fuckingmiwok.adapter.Adapter
import com.example.android.fuckingmiwok.model.WordModel

class PhrasesActivity : AppCompatActivity() {

    private lateinit var title: TextView
    private lateinit var rvPhrases: RecyclerView

    private val phrasesData : MutableList<WordModel> = mutableListOf(
        WordModel("Hallo", "Olá"),
        WordModel("Guten Morgen", "Bom dia"),
        WordModel("Gutten Tag", "Boa tarde"),
        WordModel("Guten Abend", "Boa noite"),
        WordModel("Tschüss", "Tchau"),
        WordModel("Bis bald", "Até logo"),
        WordModel("Auf Wiedersehen", "Adeus"),
        WordModel("Ja", "Sim"),
        WordModel("Nein", "Não"),
        WordModel("Danke ", "Obriagado(a)"),
        WordModel("Vielen Danke ", "Muito obrigado(a)"),
        WordModel("Bitte  schön ", "De nada"),
        WordModel("Bitte ", "Por favor"),
        WordModel("Entschuldigung  ", "Desculpe ou com licença"),
        WordModel("Vielleicht ", "talvez")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrases)

        initViews()
        showPhrases()
    }

    private fun initViews() {
        title = findViewById(R.id.phrases_page_title)
        rvPhrases = findViewById(R.id.phrases_recycler)
    }

    private fun showPhrases() {
        title.text = getString(R.string.basic_phrases)
        rvPhrases.adapter = Adapter(phrasesData)
    }
}