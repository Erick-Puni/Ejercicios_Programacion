# Solicita un año y determina si es bisiesto (divisible entre 4 pero no entre 100, excepto si es divisible entre 400).
# Ejemplo: Entrada: 2024 → Salida: "Es bisiesto".

#Titulo
print ('________________________')
print ('|     AÑO BISIESTO     |')
print ('¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨')

#Solicitar al usuario que ingrese un año 
anio = int(input('Ingrese un año: \n'))

# Verificar si es bisiesto o no
if anio % 4==0 & (anio % 100!=0 | anio % 400==0):
     print(f'El año {anio} es bisiesto')
else:
    print(f'El año {anio} no es bisiesto')