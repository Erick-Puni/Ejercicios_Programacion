package edadparavotar;

import java.util.Scanner;

public class EdadParaVotar {

    /*
       Solicita la edad del usuario y determina si es elegible para votar (mayor o igual a 18 años).
       Ejemplo: Entrada: 17 → Salida: "No puedes votar".
     */
    
    public static void main(String[] args) {
        
       // Clase Scanner   
       Scanner scan = new Scanner(System.in);
       
       // Variable
       int edad;
        
        // Titulo
       System.out.println("________________________");
       System.out.println("|   ¿ PUEDES VOTAR ?   |");
       System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Solicitar al ususario que ingrese su edad
        System.out.println("Ingrese tu edad:");
        edad = scan.nextInt();
        
        // Determinar si puede votar segun su edad
        if (edad>=18){
            System.out.println("Puedes Votar");
        }
        else{
            System.out.println("No Puedes Votar");
        } 
    }       
    
}
