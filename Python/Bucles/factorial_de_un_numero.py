#o	Calcula el factorial de un número ingresado por el usuario (n!).
#Ejemplo: Entrada: 5 → Salida: 120.

# Título
print("___________________________")
print("|   CÁLCULO DE FACTORIAL   |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Solicitar al usuario que ingrese un número
numero = int(input("Ingrese un número para calcular su factorial: \n"))

# Verificar que sea un número positivo
if numero < 0:
    print("Solo se puede con números positivos")
else:
    
    # Variable para alamcenar el resultado
    resultado = 1

    # Calcular el factorial
    for i in range(1, numero + 1):
        resultado *= i

    print(f"El factorial de {numero} es: {resultado}")
