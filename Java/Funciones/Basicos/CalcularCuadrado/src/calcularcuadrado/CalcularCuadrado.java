package calcularcuadrado;

import java.util.Scanner;

public class CalcularCuadrado {

    /*
        Escribe una función que reciba un número y retorne su cuadrado.
        Ejemplo: Entrada: 5 → Salida: 25.
     */
    public static void main(String[] args) {
        
        //Clase Scanner 
        Scanner scan = new Scanner(System.in);
        
        // Variables para almacenar el número y el resultado
        int numero,resultado;
        
        // Título
        System.out.println("_____________________________");
        System.out.println("|    CALCULAR EL CUADRADO   |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Solicitar al usuario que ingrese un numero
        System.out.println("Ingrese un número para obtener su cuadrado:");
        numero = scan.nextInt();
        
        // Llamar al metodo
        resultado = cuadrado(numero);
        
        System.out.println(resultado);
        
    }
    public static int cuadrado(int numero){  
        int cuadrado = numero * numero;
        return cuadrado;
    }
                 
}
