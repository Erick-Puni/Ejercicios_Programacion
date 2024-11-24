#Genera un número aleatorio entre 1 y 10 y solicita al usuario que adivine el número. Usa if para verificar si acertó o no.
# Ejemplo: Entrada: 5 → Salida: "¡Felicidades, acertaste!" o "Intenta de nuevo.".

# Librería para el número aleatorio
import random

# Título
print("__________________________")
print("|     JUEGO DE NÚMEROS   |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Generar un número aleatorio entre 1 y 10
num_aleatorio = random.randint(1, 10)

# Bucle para que el usuario intente adivinar
while True:
    # Solicitar al usuario que ingrese un número
    juego = int(input("Adivina el número (entre 1 y 10): \n"))

    # Verificar si acertó
    if juego == num_aleatorio:
        print("¡Felicidades, acertaste!")
        break
    else:
        print("Intenta de nuevo.")

