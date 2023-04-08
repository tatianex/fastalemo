package com.example.android.fuckingmiwok.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.fuckingmiwok.R
import com.example.android.fuckingmiwok.model.WordModel

class Adapter(
    private val list: MutableList<WordModel>
) : RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ItemViewHolder =
        ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_list,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val word: TextView = itemView.findViewById(R.id.word)
        private val translation: TextView = itemView.findViewById(R.id.translation)

        fun bind(wordModel: WordModel){
            word.text = wordModel.word
            translation.text = wordModel.translation
        }
    }
}