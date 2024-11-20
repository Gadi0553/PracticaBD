package com.example.practica1.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.practica1.Data.Gym
import com.example.practica1.GymViewModel.GymViewModel
import com.example.practica1.R
import com.example.practica1.databinding.FragmentPechoPresBancaBinding


class PechoPresBanca : Fragment() {
    val args: PechoPresBancaArgs by navArgs<PechoPresBancaArgs>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentPechoPresBancaBinding.inflate(layoutInflater)
        val viewModel = ViewModelProvider(requireActivity()).get(GymViewModel::class.java)


     viewModel.findGym(args.id)
        viewModel.currentGym.observe(viewLifecycleOwner) { gym ->
          binding.description.setText(gym.descripcion)

       }
            return binding.root

    }
}