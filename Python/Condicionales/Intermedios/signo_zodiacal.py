# Solicita el día y mes de nacimiento y determina el signo zodiacal del usuario.
# Ejemplo: Entrada: 22, marzo → Salida: "Tu signo es Aries".

# Título
print("________________________")
print("|    SIGNO ZODIACAL    |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Solicitar al usuario su día y mes de nacimiento
dia = int(input("Ingrese el día de nacimiento: \n"))
mes = input("Ingrese el mes de nacimiento: \n").strip().lower()

# Convertir el mes a minúsculas para evitar errores
mes = mes.lower()

# Determinar el signo zodiacal según el día y mes
if (mes == "marzo" and dia >= 21) or (mes == "abril" and dia <= 19):
    signo = "Aries"
elif (mes == "abril" and dia >= 20) or (mes == "mayo" and dia <= 20):
    signo = "Tauro"
elif (mes == "mayo" and dia >= 21) or (mes == "junio" and dia <= 20):
    signo = "Géminis"
elif (mes == "junio" and dia >= 21) or (mes == "julio" and dia <= 22):
    signo = "Cáncer"
elif (mes == "julio" and dia >= 23) or (mes == "agosto" and dia <= 22):
    signo = "Leo"
elif (mes == "agosto" and dia >= 23) or (mes == "septiembre" and dia <= 22):
    signo = "Virgo"
elif (mes == "septiembre" and dia >= 23) or (mes == "octubre" and dia <= 22):
    signo = "Libra"
elif (mes == "octubre" and dia >= 23) or (mes == "noviembre" and dia <= 21):
    signo = "Escorpio"
elif (mes == "noviembre" and dia >= 22) or (mes == "diciembre" and dia <= 21):
    signo = "Sagitario"
elif (mes == "diciembre" and dia >= 22) or (mes == "enero" and dia <= 19):
    signo = "Capricornio"
elif (mes == "enero" and dia >= 20) or (mes == "febrero" and dia <= 18):
    signo = "Acuario"
elif (mes == "febrero" and dia >= 19) or (mes == "marzo" and dia <= 20):
    signo = "Piscis"
else:
    signo = "Fecha no válida"

print(f"Tu signo zodiacal es: {signo}")
