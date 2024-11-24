package numeroparoimpar;

import java.util.Scanner;

public class NumeroParOImpar {

    /*
        Crea una función que reciba un número y retorne True si es par y False si es impar.
        Ejemplo: Entrada: 4 → Salida: True.
     */
    public static void main(String[] args) {
        
        // Clase Scanner
        Scanner scan = new Scanner (System.in);
        
        // Variable para almacenar el numero ingresado por el usuario
        int numero;
              
        // Título
        System.out.println("_____________________________");
        System.out.println("|     NUMERO PAR O IMPAR    |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Solicitar al usuario que ingrese un numero
        System.out.println("Ingrese un número para verificar si es par:");
        numero = scan.nextInt();
           
        // Llamada a la funcion par
        boolean resultado = par(numero);
        System.out.println(resultado);
    }
    
    // Función para verificar si el número es par o impar
    public static boolean par(int numero) {
        return numero % 2 == 0;
    }
    
}
