# Solicita calificaciones al usuario (hasta que ingrese -1) y calcula el promedio.
# Ejemplo: Entradas: 5, 7, 8, -1 → Salida: Promedio: 6.67.


# Título
print("____________________________________")
print("|     PROMEDIO DE CALIFICACIONES   |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Lista para almacenar las calificaciones
calificaciones = []

# Bucle para solicitar pedir calificaciones hasta que ingrese -1
while True:
    calificacion = float(input("Ingresa una calificación (-1 para terminar): \n"))
    if calificacion == -1:
        break
    calificaciones.append(calificacion)
    
# Condición para mostrar los promedios segun el caso
if calificaciones:
    
    # Calcular promedio
    promedio = sum(calificaciones) / len(calificaciones)
    print(f"El promedio de las calificaciones es: {promedio:.2f}")
else:
    print("No se ingresaron calificaciones.")
