import matplotlib.pyplot as plt

# Crear el gráfico base
def crear_audiograma_base():
    # Crear figura y configurar el gráfico
    plt.figure(figsize=(8, 6))  
    
    # Fondo cuadriculado
    plt.grid(which='both', linestyle='--', linewidth=0.5, alpha=0.7)
    
    # Ejes invertidos y etiquetas
    plt.gca().invert_yaxis()  # Invertir el eje Y
    plt.xticks([0, 10, 20, 25.5, 30, 35, 40, 50, 60, 70, 75, 85],
               labels=["125 Hz", "250 Hz", "500 Hz", "", "1k Hz", "", "2k Hz", "", "4k Hz", "", "8k Hz", ""], fontsize=12)
    plt.yticks(range(-10, 121, 10), fontsize=12)  # Etiquetas de -10 a 120 en pasos de 10
    plt.xlabel('Frecuencia (Hz)', fontsize=14)
    plt.ylabel('Umbral Auditivo (dB HL)', fontsize=14)

    
    # Ajustar los límites del eje Y para que se muestren todos los valores
    plt.ylim(120, -10)  # Invertir el límite del eje Y
    plt.xlim(0, 85)  # Invertir el límite del eje Y
    
    # Líneas opcionales (por ejemplo, línea base a 0 dB HL)
    plt.axhline(0, color='black', linewidth=0.8, linestyle='--')  # Línea en 0 dB HL
    
    # Mostrar la gráfica vacía con los ejes configurados
    return plt

# Función para añadir puntos manualmente
def añadir_punto(frecuencia, umbral, color='red', simbolo='o'):
    plt.scatter(frecuencia, umbral, color='white', edgecolor=color, s=100, label='Punto', zorder=5)
    plt.plot(frecuencia, umbral, simbolo, color=color)

# Crear la gráfica base
plt = crear_audiograma_base()

# Añadir puntos manualmente
frecuencias = [0,10, 20, 30, 40, 50, 60, 75]  # Frecuencias en Hz
umbral = [20, 20,40, 85, 80, 70, 65, 65]  # Umbrales en dB HL
for f, u in zip(frecuencias, umbral):
    añadir_punto(f, u, color='blue', simbolo='o')

# Conectar todos los puntos con una línea

plt.plot(frecuencias, umbral, color='blue', linestyle='-', linewidth=2, zorder=3)


# Mostrar el resultado
plt.tight_layout()
plt.show()
