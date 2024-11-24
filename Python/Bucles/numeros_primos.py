#	Encuentra e imprime todos los números primos entre 1 y 50.
#	Salida esperada: 2, 3, 5, 7, ..., 47.

# Título
print("________________________")
print("|     NUMEROS PRIMOS   |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Clacular los número primos
for num in range(2, 51):
    es_primo = True
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            es_primo = False
            break
    if es_primo:
        print(num, end=", ")

