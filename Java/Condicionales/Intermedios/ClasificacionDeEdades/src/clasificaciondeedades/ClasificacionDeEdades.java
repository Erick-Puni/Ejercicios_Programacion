package clasificaciondeedades;

import java.util.Scanner;

public class ClasificacionDeEdades {

    /*
        Solicita una edad y clasifica al usuario como niño (0-12), adolescente (13-17) o adulto (18+).
        Ejemplo: Entrada: 15 → Salida: "Eres adolescente".
     */
    public static void main(String[] args) {
        
        //Clase Scanner
        Scanner scan = new Scanner(System.in);
        
        //Varible
        int edad;
        
        // Título
        System.out.println("_____________________________");
        System.out.println("|   CLASIFICACIÓN DE EDAD   |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        // Solicitar al usuario que ingrese su edad
        System.out.println("Ingrese su edad:");
        edad = scan.nextInt();
        
        // Clasificar segun si edad
        if(edad>=0 && edad<=12){
            System.out.println("Eres niño");
            
        }
        else{
            if(edad>=13 && edad<=17){
                System.out.println("Eres adolescente");
            }
            else{
                System.out.println("Eres adulto");
            }
        }           
    }     
}
