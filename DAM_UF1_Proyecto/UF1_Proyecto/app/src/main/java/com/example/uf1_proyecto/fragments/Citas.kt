package com.example.uf1_proyecto.fragments

import android.icu.util.Calendar
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.uf1_proyecto.R
import com.example.uf1_proyecto.clases.Recordatorio
import com.example.uf1_proyecto.Dao.DaoRecordatorio

class Citas : Fragment() {

    private var horaSeleccionada: String? = null  // Almacenamso la hora seleccionada
    private var horaSeleccionadaNumerica: Int = -1  // hora en formato numerico
    private var minutosSeleccionados: Int = -1  // minutos
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_citas, container, false)
        val btnPedirCita = view.findViewById<Button>(R.id.btnPedirCita)
        val calendario = view.findViewById<CalendarView>(R.id.calendarioCitas)
        val btn1 = view.findViewById<Button>(R.id.btnHorario1)
        val btn2 = view.findViewById<Button>(R.id.btnHorario2)
        val btn3 = view.findViewById<Button>(R.id.btnHorario3)
        val btn4 = view.findViewById<Button>(R.id.btnHorario4)
        val btn5 = view.findViewById<Button>(R.id.btnHorario5)
        val btn6 = view.findViewById<Button>(R.id.btnHorario6)
        val btn7 = view.findViewById<Button>(R.id.btnHorario7)
        val btn8 = view.findViewById<Button>(R.id.btnHorario8)
        val btn9 = view.findViewById<Button>(R.id.btnHorario9)

        //valor de la fecha actual
        val fechaActual = Calendar.getInstance()

        //valor de la fecha seleciconada
        var fechaSeleccionada = Calendar.getInstance()

        calendario.setOnDateChangeListener { _, year, month, dayOfMonth ->
            fechaSeleccionada.set(year, month, dayOfMonth)
        }

        // asiganmso la hora seleccionada y los minutos
        val seleccionarHorario = { button: Button, hora: String ->
            horaSeleccionada = hora
            val horaPartida = hora.split(":")
            horaSeleccionadaNumerica = horaPartida[0].toInt() //hora
            minutosSeleccionados = horaPartida[1].toInt() // minutos
        }

        // Asignar los listeners a los botones
        btn1.setOnClickListener {
            seleccionarHorario(btn1, "9:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))

        }
        btn2.setOnClickListener { seleccionarHorario(btn2, "10:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
        }
        btn3.setOnClickListener { seleccionarHorario(btn3, "11:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
        }
        btn4.setOnClickListener { seleccionarHorario(btn4, "12:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))}
        btn5.setOnClickListener { seleccionarHorario(btn5, "13:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))}
        btn6.setOnClickListener { seleccionarHorario(btn6, "16:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))}
        btn7.setOnClickListener { seleccionarHorario(btn7, "17:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))}
        btn8.setOnClickListener { seleccionarHorario(btn8, "18:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))}
        btn9.setOnClickListener { seleccionarHorario(btn9, "19:00")
            btn1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn6.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn7.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn8.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.fondoCartas))
            btn9.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.azulClaro))}


        btnPedirCita.setOnClickListener {
            if (horaSeleccionada != null) {
                fechaSeleccionada.set(Calendar.HOUR_OF_DAY, horaSeleccionadaNumerica)
                fechaSeleccionada.set(Calendar.MINUTE, minutosSeleccionados)

                // Verifica si la fecha es hoy y la hora seleccionada es anterior a la hora actual
                if (fechaSeleccionada.get(Calendar.DAY_OF_YEAR) == fechaActual.get(Calendar.DAY_OF_YEAR)) { //Si la fecha selerccioanda es la misma que la de dia de hoy
                    if (horaSeleccionadaNumerica < fechaActual.get(Calendar.HOUR_OF_DAY) ||
                        (horaSeleccionadaNumerica == fechaActual.get(Calendar.HOUR_OF_DAY) && minutosSeleccionados < fechaActual.get(Calendar.MINUTE))) {
                        Toast.makeText(context, getString(R.string.horaPasada), Toast.LENGTH_SHORT).show() // mostramos un mensaje de error
                        return@setOnClickListener // No permite continuar si la hora ya pasó
                    }
                }
                //verificamos que la fecha es la correcta
                if (fechaSeleccionada.timeInMillis < fechaActual.timeInMillis) {
                    Toast.makeText(context, getString(R.string.fechaValida), Toast.LENGTH_SHORT).show() //mostramos un mensaje de error
                    return@setOnClickListener // Evita seguir si la fecha es anterior
                }

                val fecha = fechaSeleccionada.timeInMillis
                val descripcionCita = getString(R.string.citaEn)+ " $horaSeleccionada"

                // Crear el recordatorio o lo que sea necesario
                val nuevoRecordatorio = Recordatorio(descripcionCita, fecha)

                // Agregar el recordatorio y guardarlo
                DaoRecordatorio.listaRecordatorios.add(nuevoRecordatorio)
                DaoRecordatorio.guardarRecordatorios(requireContext())
                view.findNavController().navigate(R.id.action_citas_to_citaConExito)

            } else {
                // Si no se ha seleccionado un horario
                Toast.makeText(context, getString(R.string.seleccionHorario), Toast.LENGTH_SHORT).show() //mostramos un mensaje de error
            }

        }
        return view
    }
}