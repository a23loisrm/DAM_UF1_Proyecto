package com.example.uf1_proyecto.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.uf1_proyecto.R

class CitaConExito : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cita_con_exito, container, false)
        val btnVerCita = view.findViewById<Button>(R.id.btnVerCita)

        btnVerCita.setOnClickListener {
            view.findNavController().navigate(R.id.action_citaConExito_to_recordatorios)
        }
        return view
    }

}