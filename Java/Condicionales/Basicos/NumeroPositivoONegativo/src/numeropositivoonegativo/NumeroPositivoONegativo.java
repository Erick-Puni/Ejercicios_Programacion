package numeropositivoonegativo;

import java.util.Scanner;

public class NumeroPositivoONegativo {

    /*
     Solicita al usuario un número y determina si es positivo, negativo o cero.
     Ejemplo: Entrada: -3 → Salida: "Es un número negativo".    
     */
    
    public static void main(String[] args) {
        
        // Clase Scanner
        Scanner scan = new Scanner (System.in); 
        
        // Variable
        int num1;
        // Titulo
        
        System.out.println("_____________________________");
        System.out.println("|   POSITIVO O NEGATIVO     |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Solicitar al ususario que ingrese un número para hacer la comparación
        System.out.println("Ingrese un número:");
        num1 = scan.nextInt();
        
        // Determinar si es positivo o negativo
        if (num1==0){
            System.out.printf("El número: %d es igual a: 0\n",num1);
        }else{
            if(num1>0){
                System.out.printf("Es un número positivo\n",num1);
            }else{
                System.out.printf("Es un número negativo \n",num1);
            }
        }         
    } 
}
