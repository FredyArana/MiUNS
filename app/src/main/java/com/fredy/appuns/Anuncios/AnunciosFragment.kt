package com.fredy.appuns.Anuncios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fredy.appuns.R
import com.fredy.appuns.databinding.FragmentAnunciosBinding

class AnunciosFragment : Fragment() {

    private var _binding: FragmentAnunciosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnunciosBinding.inflate(inflater, container, false)

        setupRecyclerView()

        return binding.root
    }

    private fun setupRecyclerView() {
        val anuncios = listOf(
            Anuncio("Comité evaluador verifica calidad académica",
                "Escuela de Medicina UNS",
                R.drawable.img1
            ),
            Anuncio("Prácticas de hidráulica en Minas Gerais",
                "Ingeniería Civil UNS",
                R.drawable.img2
            ),
            Anuncio("Elección de representantes",
                "Órganos de Gobierno UNS",
                R.drawable.img3
            )
        )

        val adapter = AnunciosAdapter(anuncios)
        binding.recyclerViewAnuncios.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewAnuncios.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}