package com.example.uf1_proyecto.adaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uf1_proyecto.R
import com.example.uf1_proyecto.clases.Recordatorio
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CustomAdapter(private val recordatorios: MutableList<Recordatorio>
,     private val onDelete: (Recordatorio) -> Unit) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val descripcion: TextView = view.findViewById(R.id.textDescripcion)
        val fechaHora: TextView = view.findViewById(R.id.textFechaHora)
        val imageFecha: ImageView = view.findViewById(R.id.imageFecha)
        val btnDelete: ImageView = view.findViewById(R.id.btnDelete)


        fun bind(recordatorio: Recordatorio, onDelete: (Recordatorio) -> Unit) {
            // Convertir el timestamp a fecha
            val date = Date(recordatorio.fechaHora)
            val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            val formattedDate = dateFormat.format(date)

            // Establecer descripción y fecha
            descripcion.text = recordatorio.descripcion
            fechaHora.text = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())
                .format(date)

            // Extraer el día de la fecha
            val dia = formattedDate.substring(0, 2) // Obtener los primeros 2 caracteres (día)

            // Cargar la imagen del día
            val context = itemView.context
            val imageResource = context.resources.getIdentifier("calendario$dia", "drawable", context.packageName)
            imageFecha.setImageResource(imageResource)  // Si la imagen existe, cargarla


            // Configurar acción para el botón de eliminar
            btnDelete.setOnClickListener {
                onDelete(recordatorio)
            }
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Aquí debes inflar el layout del item, no el layout del fragmento completo
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.fragment_item_recycler_view, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.bind(recordatorios[position], onDelete)
    }
    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int = recordatorios.size

    // ordenar la fehca
    fun ordenarPorFecha(ascendente: Boolean = true) {
        if (ascendente) {
            recordatorios.sortBy { it.fechaHora }
        } else {
            recordatorios.sortByDescending { it.fechaHora }
        }
        notifyDataSetChanged() // Notificar cambios al RecyclerView
    }

}
