# Solicita dos números y una operación (+, -, *, /) y realiza el cálculo correspondiente.
# Ejemplo: Entrada: 3, 2, '+' → Salida: "Resultado: 5".

#Titulo
print ('________________________')
print ('|  CALCULADORA BASICA  |')
print ('¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨')

# Solicitar al usuario que ingrese 2 numeros 
num1 = int(input('Ingrese el primer número: \n'))
num2 = int (input('Ingrese el segundo número: \n'))

#Solicitar al usuario que ingrese una operación
operacion = int (input('\nIngrese la operación que desee realizar:\n1 (Suma)\n2 (Resta)\n3 (Multiplicación)\n4 (Divisiíon)\n'))

# Realizar la operación segun corresponda
if operacion == 1:
    sum = num1+num2
    print(f'{num1} + {num2} = {sum}')
    
elif operacion == 2:
    res = num1-num2
    print(f'{num1} - {num2} = {res}')
    
elif operacion == 3:
    mul = num1*num2
    print(f'{num1} x {num2} = {mul}')
    
elif operacion == 4:
    div = num1/num2
    print(f'{num1} / {num2} = {div}')
    
else:
    print('Fuera de rango')


