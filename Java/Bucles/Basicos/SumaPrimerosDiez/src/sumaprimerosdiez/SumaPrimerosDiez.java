package sumaprimerosdiez;

public class SumaPrimerosDiez {

    /*
        Calcula y muestra la suma de los números del 1 al 10.
        Salida esperada: 55.
     */
    public static void main(String[] args) {
        
        // Título
        System.out.println("____________________________________");
        System.out.println("| SUMA DE LOS PRIMEROS DIEZ NUMEROS |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Variable contador
        int suma=0;
        
        // Bucle para iterar y sumar los números
        for(int i = 0 ; i <10 ; i++){
            
            if (i<=10){
                suma+=(i+1);               
            }
        }
        System.out.println(suma);
    }
}
