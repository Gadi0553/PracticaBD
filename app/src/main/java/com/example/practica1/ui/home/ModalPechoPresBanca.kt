package com.example.practica1.ui.home

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import com.example.practica1.R
import com.example.practica1.databinding.FragmentModalPechoPresBancaBinding


class ModalPechoPresBanca(

    ) : DialogFragment() {

   val args: ModalPechoPresBancaArgs by navArgs<ModalPechoPresBancaArgs>()
    private lateinit var binding: FragmentModalPechoPresBancaBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = FragmentModalPechoPresBancaBinding.inflate(LayoutInflater.from(context))

        val builder = AlertDialog.Builder(requireActivity())
        builder.setView(binding.root)



        val dialog  = builder.create()
        dialog.window!!.setGravity(Gravity.CENTER)
        return dialog

}   }