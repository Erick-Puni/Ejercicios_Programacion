package aprobadooreprobado;

import java.util.Scanner;

public class AprobadoOReprobado {

    /*
       Solicita la calificación de un estudiante y determina si está aprobado (mayor o igual a 7) o reprobado.
       Ejemplo: Entrada: 6.5 → Salida: "Reprobado".
    */
    
    public static void main(String[] args) {
        
        // Clase Scanner
        Scanner scan = new Scanner(System.in);
        
        // Variable
        double calificacion;
        
        // Titulo
        System.out.println("_____________________________");
        System.out.println("|    APROBADO O REPROBADO   |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Solicitar al ususario que ingrese un número para hacer la comparación
        System.out.println("Ingrese su calificación obtenida");
        calificacion = scan.nextDouble();
        
        // Determinar si aprobo o no
        if (calificacion>=7){
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Reprobado");
        } 
    }
    
}
