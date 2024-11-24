package imprimirnumeros;

public class ImprimirNumeros {

    /*
        Usa un bucle para mostrar los números del 1 al 10 en la consola.
        Salida esperada: 1, 2, 3, ..., 10.
     */
    public static void main(String[] args) {
        
        // Título
        System.out.println("_____________________________");
        System.out.println("|    NUMEROS DEL 1 AL 10    |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        for(int i=0 ; i<10 ; i++){
            System.out.print((i+1)+", ");
        }
    }
}
