package paroimpar;

import java.util.Scanner;

public class ParOImpar {

    /*
        Solicita un número al usuario y determina si es par o impar.
        Ejemplo: Entrada: 4 → Salida: "Es par".
     */
    
    public static void main(String[] args) {
        
        // Clase Scanner
        Scanner scan =new Scanner(System.in);
        
        // variable
        int numero;
        
        // Título
        System.out.println("_________________");
        System.out.println("|  PAR O IMPAR  |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número");
        numero = scan.nextInt();
        
        if (numero % 2==0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
    }   
}
