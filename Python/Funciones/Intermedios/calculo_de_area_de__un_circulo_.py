# Crea una función que reciba el radio de un círculo y retorne su área. Fórmula: Área = π * radio^2.
# Ejemplo: Entrada: 3 → Salida: 28.27 (aproximado).

# Título
print("_______________________________________")
print("|     CALCULO DEL AREA DE UN CIRCULO  |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Librería para operaciones matemáticas
import math

# Función que recibe el radio de un círculo y retorna su área
def calcular_area_circulo(radio):
    
    # Calculo del área
    return math.pi * radio**2

# Solicitar al usuario que ingrese el radio del circulo.
radio = float(input("Ingresa el radio del círculo: \n"))
area = calcular_area_circulo(radio)

print(f"El área del círculo con radio {radio} es: {area:.2f}")
