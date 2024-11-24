# Solicita un número entero y calcula la suma de sus dígitos.
# Ejemplo: Entrada: 123 → Salida: 6 (1 + 2 + 3).

# Título
print("__________________________")
print("|     SUMAR DIGITOS      |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Solicitar al usuario que ingrese un número
numero = int(input("Ingrese un número para sumar sus dígitos: \n"))

# Sumar lo digitos 
suma = sum(int(digito) for digito in str(abs(numero)))
print(f"La suma de los dígitos de {numero} es: {suma}")
