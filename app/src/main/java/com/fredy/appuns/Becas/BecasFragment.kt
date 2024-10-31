package com.fredy.appuns.Becas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.fredy.appuns.R
import com.fredy.appuns.databinding.FragmentBecasBinding

class BecasFragment : Fragment() {

    private var _binding: FragmentBecasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBecasBinding.inflate(inflater, container, false)

        setupRecyclerView()
        setupFab()

        return binding.root
    }

    private fun setupRecyclerView() {
        val becas = listOf(
            Beca("Beca de Excelencia", "Para estudiantes con alto rendimiento", R.drawable.sample_beca),
            Beca("Beca Internacional", "Intercambio académico en el extranjero", R.drawable.sample_beca),
            Beca("Beca de Investigación", "Apoyo para proyectos científicos", R.drawable.sample_beca)
        )

        val adapter = BecasAdapter(becas)
        binding.recyclerViewBecas.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewBecas.adapter = adapter
    }

    private fun setupFab() {
        binding.fab.setOnClickListener {
            Toast.makeText(requireContext(), "Aplicar a Beca", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}