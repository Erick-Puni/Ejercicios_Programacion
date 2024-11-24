# Solicita un nombre de usuario y contraseña, y valida si ambos son correctos. Permite tres intentos antes de bloquear el acceso.
# Ejemplo: Entrada: Usuario: admin, Contraseña: 1234 → Salida: "Bienvenido, admin.".


# Usuario y contraseña válidos
USUARIO_VALIDO = "admin"
CONTRASENA_VALIDA = "1234"

# Título 
print("__________________________")
print("|   CONTROL DE ACCESO    |")
print("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")

# Variable para almacenar los intenetos
intentos = 0
MAX_INTENTOS = 3

while intentos < MAX_INTENTOS:
    
    # Solicitar al usuario que ingrese su usuario y contrseña
    usuario = input("Ingrese su nombre de usuario: \n")
    contrasena = input("Ingrese su contraseña: \n")
    
    # Verifficar que sean correctas
    if usuario == USUARIO_VALIDO and contrasena == CONTRASENA_VALIDA:
        print(f"Bienvenido, {usuario}.")
        break
    else:
        intentos += 1
        print("Usuario o contraseña incorrectos. Intenta de nuevo.")
        print(f"Intentos restantes: {MAX_INTENTOS - intentos}")
else:
    # Mensaje cuando se alcanzan los intentos máximos
    print("Acceso bloqueado.")
