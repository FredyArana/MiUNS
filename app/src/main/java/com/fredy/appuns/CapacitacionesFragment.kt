package com.fredy.appuns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fredy.appuns.databinding.FragmentCapacitacionesBinding
import com.google.android.material.snackbar.Snackbar

class CapacitacionesFragment : Fragment() {

    private var _binding: FragmentCapacitacionesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCapacitacionesBinding.inflate(inflater, container, false)


        binding.btnBuscar.setOnClickListener {
            Snackbar.make(binding.root, "Buscando capacitaciones...", Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}