package mayordetresnumeros;

import java.util.Scanner;

public class MayorDeTresNumeros {
     /*
        Solicita tres números y determina cuál es el mayor.
        Ejemplo: Entrada: 4, 9, 2 → Salida: "El número mayor es 9".
     */

    public static void main(String[] args) {

        // Clase Scanner
        Scanner scan = new Scanner(System.in);

        // Título
        System.out.println("____________________________");
        System.out.println("|   MAYOR DE TRES NÚMEROS   |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        // Solicitar al usuario que ingrese tres números
        System.out.println("Ingrese el primer número:");
        int num1 = scan.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Ingrese el tercer número:");
        int num3 = scan.nextInt();

        // Determinar el mayor usando 
        int mayor;

        if (num1 > num2) {
            if (num1 > num3) {
                mayor = num1;
            } else {
                mayor = num3;
            }
        } else {
            if (num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
        }

        // Mostrar el resultado
        System.out.println("El número mayor es: " + mayor);
    }
}

