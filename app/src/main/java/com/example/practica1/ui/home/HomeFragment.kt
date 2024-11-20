package com.example.practica1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practica1.databinding.FragmentHomeBinding
import com.example.practica1.ui.home.HomeFragmentDirections

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentHomeBinding.inflate(layoutInflater)

        // Establece el OnClickListener para el botón de pecho
        binding.pechoButton.setOnClickListener {
            val action = HomeFragmentDirections.actionNavHomeToPecho2()
            findNavController().navigate(action)
        }

        // Establece el OnClickListener para el botón de hombro
        binding.hombroButon.setOnClickListener {
            val action = HomeFragmentDirections.actionNavHomeToHombro()
            findNavController().navigate(action)
        }

        // Establece el OnClickListener para el botón de espalda
        binding.espaldaButon.setOnClickListener {
            val action = HomeFragmentDirections.actionNavHomeToEspalda()
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Limpia la referencia al binding
    }
}
