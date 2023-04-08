package com.example.android.fuckingmiwok.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.fuckingmiwok.R
import com.example.android.fuckingmiwok.adapter.Adapter
import com.example.android.fuckingmiwok.model.WordModel

class FamilyActivity : AppCompatActivity() {

    private lateinit var title : TextView
    private lateinit var rvFamily:  RecyclerView

    private val familyData : MutableList<WordModel> = mutableListOf(
        WordModel("eltern", "pais"),
        WordModel("vater", "pai"),
        WordModel("mutter", "mãe"),
        WordModel("kind", "criança"),
        WordModel("bruder", "irmão"),
        WordModel("schwester", "irmã"),
        WordModel("tochter", "filha"),
        WordModel("sohn", "filho"),
        WordModel("stiefmutter", "madrasta"),
        WordModel("stiefvater", "padrasto"),
        WordModel("schwägerin", "cunhada"),
        WordModel("schwager", "cunhado"),
        WordModel("schwiegermutter", "sogra"),
        WordModel("schwiegervater", "sogro"),
        WordModel("schwiegertochter", "nora"),
        WordModel("schwiegersohn", "genro"),
        WordModel("tante", "tia"),
        WordModel("onkel", "tio"),
        WordModel("nichte", "sobrinha"),
        WordModel("neffe", "sobrinho"),
        WordModel("cousin", "primo"),
        WordModel("cousine", "prima"),
        WordModel("großeltern", "avós"),
        WordModel("großmutter", "avó"),
        WordModel("großvater", "avô"),
        WordModel("urgroßmutter", "bisavó"),
        WordModel("urgroßvater", "bisavô"),
        WordModel("enkel", "neto"),
        WordModel("enkelin", "neta"),
        WordModel("urenkel", "bisneto"),
        WordModel("urenkelin", "bisneta"),
        WordModel("ehemann", "marido"),
        WordModel("ehefrau", "esposa"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)

        initViews()
        showFamily()
    }

    private fun initViews() {
        title = findViewById(R.id.family_page_title)
        rvFamily = findViewById(R.id.family_recycler)
    }

    private fun showFamily() {
        title.text = getString(R.string.family_members)
        rvFamily.adapter = Adapter(familyData)
    }
}