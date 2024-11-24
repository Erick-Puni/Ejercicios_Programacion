# Solicita una calificación numérica y devuelve la letra correspondiente:90-100: A. 80-89: B. 70-79: C. 60-69: D. Menor a 60: F.
# Ejemplo: Entrada: 85 → Salida: "Tu calificación es B".


# Titulo
print('________________________')
print('|    CALIFICACIONES    |')
print('¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨')

# Solicitar al usuario que ingrese su calificación
calificacion = int(input('Ingrese su calificación: \n'))

# Mostrar la letra correspondiente según corresponda
if calificacion < 60:
    print('Tu calificación es: F')
elif 60 <= calificacion <= 69:
    print('Tu calificación es: D')
elif 70 <= calificacion <= 79:
    print('Tu calificación es: C')
elif 80 <= calificacion <= 89:
    print('Tu calificación es: B')
elif 90 <= calificacion <= 100:
    print('Tu calificación es: A')
else:
    print('Calificación inválida. Por favor, ingresa un número entre 0 y 100.')
