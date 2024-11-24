package contadorregresivo;

public class ContadorRegresivo {

    /*
        Imprime los números del 10 al 1 en orden descendente.
        Salida esperada: 10, 9, 8, ..., 1.
    */
    public static void main(String[] args) {
        
        // Título
        System.out.println("_____________________________");
        System.out.println("|     Contador Regresivo    |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Bucle for para realizar el conteo
        for (int i=10 ; i>0 ; i--){
            System.out.print(i+", ");
        }
    }
}
