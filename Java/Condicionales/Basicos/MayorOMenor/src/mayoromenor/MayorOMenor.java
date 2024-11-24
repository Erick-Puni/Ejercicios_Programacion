package mayoromenor;
import java.util.Scanner;

public class MayorOMenor {
    
    /*   
       Escribe un programa que solicite un número y determine si es mayor o menor que 10.
       Ejemplo: Entrada: 5 → Salida: "Es menor que 10".
    */ 
    
    public static void main(String[] args) {
        
        // Clase Scanner
        Scanner scan = new Scanner(System.in);
        
        // Variables
        int num1,num2=10;
        
        // Titulo
        System.out.println("_____________________________");
        System.out.println("|       MAYOR O MENOR       |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Solicitar al ususario que ingrese un número para hacer la comparación
        System.out.println("Ingrese un número:");
        num1 = scan.nextInt();
        
        // Determinar si es mayor o menor que 10
        if (num1==num2){
            System.out.printf("El número: %d es igual a: 10\n",num1);
        }else{
            if(num1>num2){
                System.out.printf("El número: %d es mayor que 10\n",num1);
            }else{
                System.out.printf("El número %d es menor que 10\n",num1);
            }
        }
    }  
}
