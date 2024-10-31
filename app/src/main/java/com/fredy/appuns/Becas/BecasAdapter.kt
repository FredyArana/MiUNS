package com.fredy.appuns.Becas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fredy.appuns.R

class BecasAdapter(private val becasList: List<Beca>) :
    RecyclerView.Adapter<BecasAdapter.BecaViewHolder>() {

    class BecaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.tvTituloBeca)
        val descripcion: TextView = itemView.findViewById(R.id.tvDescripcionBeca)
        val imagen: ImageView = itemView.findViewById(R.id.imageBeca)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BecaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_beca, parent, false)
        return BecaViewHolder(view)
    }

    override fun onBindViewHolder(holder: BecaViewHolder, position: Int) {
        val beca = becasList[position]
        holder.titulo.text = beca.titulo
        holder.descripcion.text = beca.descripcion
        holder.imagen.setImageResource(beca.imagenResId)
    }

    override fun getItemCount(): Int = becasList.size
}