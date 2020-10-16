package com.example.appconjunto.ui.main

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*


class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private val textView = itemView.title_item

    fun bind (alumno: Alumno){
        textView.text = alumno.nombre
    }
}




