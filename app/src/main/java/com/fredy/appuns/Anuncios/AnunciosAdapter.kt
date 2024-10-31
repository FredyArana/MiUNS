package com.fredy.appuns.Anuncios

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fredy.appuns.R

class AnunciosAdapter(private val anunciosList: List<Anuncio>) :
    RecyclerView.Adapter<AnunciosAdapter.AnuncioViewHolder>() {

    class AnuncioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.titulo)
        val descripcion: TextView = itemView.findViewById(R.id.descripcion)
        val imagen: ImageView = itemView.findViewById(R.id.imagen)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnuncioViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_anuncio, parent, false)
        return AnuncioViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnuncioViewHolder, position: Int) {
        val anuncio = anunciosList[position]
        holder.titulo.text = anuncio.titulo
        holder.descripcion.text = anuncio.descripcion
        holder.imagen.setImageResource(anuncio.imagenResId)
    }

    override fun getItemCount(): Int = anunciosList.size
}