package descuentoentienda;

import java.util.Scanner;

public class DescuentoEnTienda {

    /* 
        Una tienda ofrece un 20% de descuento si el cliente gasta más de $100. Escribe un programa que calcule el monto final.
        Ejemplo: Entrada: $120 → Salida: "Monto final: $96".
     */
    public static void main(String[] args) {
        
        // Clase Scanner
        Scanner scan = new Scanner(System.in);
        
        // variable
        double precio,descuento,montoFinal;
        
        // Titulo 
        System.out.println("_____________________________");
        System.out.println("|           TIENDA           |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Solicitar al ususario que ingrese el precio para realizar el descuento si aplica
        System.out.println("Ingrese el precio de su compra: ");
        precio = scan.nextDouble();
        
        // Verificar y mostrar si tiene descuento
        if (precio>100){          
            descuento = precio *0.20;
        }
        else{
            descuento = 0;
        }
        montoFinal = precio - descuento;
        
        System.out.println("Monto Final: $"+montoFinal);
    }
}
