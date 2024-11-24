package contarnumeropares;

public class ContarNumeroPares {

    /*  Imprime todos los números pares entre 1 y 20.
        Salida esperada: 2, 4, 6, ..., 20.
     */
    public static void main(String[] args) {
        
        // Título
        System.out.println("_____________________________");
        System.out.println("|     NUMEROS PARES 1-20    |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        //variable para almacenar los pares
        int pares;
        
        // Bucle para mostrar los números
        for (int i=1 ; i<=20 ; i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
    }
    
}
