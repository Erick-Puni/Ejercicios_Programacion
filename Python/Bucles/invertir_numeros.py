# Solicita un número entero y muestra su versión invertida.
# Ejemplo: Entrada: 1234 → Salida: 4321.

# Título
print("__________________________")
print("|     INVERTIR NUMEROS   |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Solicita un número 
numero = int(input("Ingrese un número para invertirlo: \n"))

# Invertir el número
numero_invertido = int(str(abs(numero))[::-1])
if numero < 0:
    numero_invertido = -numero_invertido
print(f"El número invertido de {numero} es: {numero_invertido}")
