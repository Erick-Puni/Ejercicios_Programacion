# Crea una función que reciba un nombre como parámetro y retorne un saludo.
# Ejemplo: Entrada: María → Salida: "Hola, María!".

# Título
print("______________________________")
print("|     SALUDO PERSONALIZADO   |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Función que recibe un nombre como parámetro y retorna un saludo
def saludo_personalizado(nombre):
    return f"Hola, {nombre}!"

# Solicitar al usuario que ingrese su nombre
nombre = input("Ingrese su nombre: \n")
print(saludo_personalizado(nombre))



