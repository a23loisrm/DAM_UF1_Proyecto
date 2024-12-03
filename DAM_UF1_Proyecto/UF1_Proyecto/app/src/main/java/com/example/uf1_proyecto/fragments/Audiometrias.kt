package com.example.uf1_proyecto.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.uf1_proyecto.R

class Audiometrias : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_audiometrias, container, false)
        val card2009 = view.findViewById<CardView>(R.id.cardAudiometria2009)
        val card2010 = view.findViewById<CardView>(R.id.cardAudiometria2010)
        val card2012 = view.findViewById<CardView>(R.id.cardAudiometria2012)
        val card2013 = view.findViewById<CardView>(R.id.cardAudiometria2013)
        val card2014 = view.findViewById<CardView>(R.id.cardAudiometria2014)
        val card2015 = view.findViewById<CardView>(R.id.cardAudiometria2015)
        val card2016 = view.findViewById<CardView>(R.id.cardAudiometria2016)
        val card2017 = view.findViewById<CardView>(R.id.cardAudiometria2017)
        val card2018 = view.findViewById<CardView>(R.id.cardAudiometria2018)
        val card2019 = view.findViewById<CardView>(R.id.cardAudiometria2019)
        val card2024 = view.findViewById<CardView>(R.id.cardAudiometria2024)

        card2009.setOnClickListener {
            // Creamos un Bundle para pasar las imagenes al fragmento donde mostraremos las audiometrias
            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiografiaoidoderecho2009)
            bundle.putInt("imagenIzquierdo", R.drawable.audiografiaoidoizquierdo2009)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2010.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho201012)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2010_12)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2012.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho201208)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2012_08)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2013.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho2013_03)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2013_03)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2014.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho2014_06)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2014_06)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2015.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho2015_07)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2015_07)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2016.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho2016_02)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2016_02)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2017.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho2017)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2017)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2018.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho2018)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2018)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2019.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho2019)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2019)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }

        card2024.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("imagenDerecho", R.drawable.audiometriaoidoderecho2024)
            bundle.putInt("imagenIzquierdo", R.drawable.audiometriaoidoizquierdo2024)

            // Navegamos al  fragmento y le pasamos el Bundle
            view.findNavController().navigate(R.id.action_audiometrias_to_audiometria, bundle)
        }


        return view
    }

}