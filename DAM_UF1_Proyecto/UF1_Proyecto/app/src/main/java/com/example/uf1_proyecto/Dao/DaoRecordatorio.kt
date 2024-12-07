package com.example.uf1_proyecto.Dao

import android.content.Context
import com.example.uf1_proyecto.clases.Recordatorio
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.lang.reflect.Type

object DaoRecordatorio {

    // Lista que contiene todos los recordatorios
    val listaRecordatorios = mutableListOf<Recordatorio>()

    // Función para guardar los recordatorios en un archivo JSON
    fun guardarRecordatorios(context: Context) {
        val gson = Gson()
        val json = gson.toJson(listaRecordatorios) // Convertir lista a JSON
        try {
            // Guardar el JSON en un archivo dentro del movil, data/data/com.example.uf1_proyecto/files
            val file = File(context.filesDir, "recordatorios.json")
            FileWriter(file).use {
                it.write(json)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    // Función para cargar los recordatorios desde un archivo JSON
    fun cargarRecordatorios(context: Context) {
        val gson = Gson()
        try {
            val file = File(context.filesDir, "recordatorios.json")
            if (file.exists()) {
                val type: Type = object : TypeToken<List<Recordatorio>>() {}.type
                val reader = FileReader(file)
                val recordatorios: List<Recordatorio> = gson.fromJson(reader, type)
                listaRecordatorios.clear()
                listaRecordatorios.addAll(recordatorios) // Cargar los recordatorios al manager
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun eliminarRecordatorio(context: Context, recordatorio: Recordatorio) {
        listaRecordatorios.remove(recordatorio)
        guardarRecordatorios(context)
    }
}
