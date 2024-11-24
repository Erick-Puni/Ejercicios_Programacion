package tablademultiplicar;

import java.util.Scanner;

public class TablaDeMultiplicar {

    /*
        Solicita un número al usuario y muestra su tabla de multiplicar del 1 al 10.
        Ejemplo: Entrada: 5 → Salida: 5 x 1 = 5, ..., 5 x 10 = 50.
     */
    public static void main(String[] args) {
        
        // Clase Scanner
        Scanner scan = new Scanner(System.in);
        
        // Variable para almacenar el numero ingresado por el usuario
        int numero;
        
        // Título
        System.out.println("_____________________________");
        System.out.println("|   TABLA DE MULTIPLICAR    |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        //Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        numero = scan.nextInt();
        
        //Variable para acumular las respuestas
        int respuesta;
        
        //Bucle para realizar talbla de multiplicar
        for(int i = 0 ; i<10 ; i++){
            respuesta = numero *(i+1);
            System.out.println(numero+" x "+(i+1)+" = "+respuesta);
        }
    }
    
}
