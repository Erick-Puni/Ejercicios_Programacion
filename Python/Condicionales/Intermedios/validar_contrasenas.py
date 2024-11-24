# Escribe un programa que solicite una contraseña y valide si es correcta (ejemplo: contraseña fija es 12345).
# Ejemplo: Entrada: 12345 → Salida: "Acceso concedido".

#Titulo
print ('________________________')
print ('|  VALIDAR CONTRASEÑA  |')
print ('¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨')

# contraseña fija
contrasenia_fija = 12345

# Solicitar al usuario ingresar una contraseña
contrasenia = int(input('Ingrese la contraseña: \n'))
if contrasenia == contrasenia_fija:
    print ('Acceso Concedido')
else:
    print ('Acceso Denegado')