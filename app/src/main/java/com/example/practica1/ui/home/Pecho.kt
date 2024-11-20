package com.example.practica1.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.practica1.Data.Gym
import com.example.practica1.GymViewModel.GymViewModel
import com.example.practica1.R
import com.example.practica1.databinding.FragmentPechoBinding


class Pecho : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding= FragmentPechoBinding.inflate(layoutInflater)

        val viewModel = ViewModelProvider(requireActivity()).get(GymViewModel::class.java)
        // Establece el OnClickListener para el botón de espalda
        binding.frButon.setOnClickListener {

         //  val gym = Gym(6,"hola")
        //  viewModel.insert(gym)

            val action = PechoDirections.actionPecho2ToPechoPresBanca(1)
            findNavController().navigate(action)
        }

        return binding.root
    }


}