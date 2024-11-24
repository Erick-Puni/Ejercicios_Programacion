package sumadedosnumeros;

public class SumaDeDosNumeros {

    /*
        Escribe una función que reciba dos números como parámetros y retorne su suma.
        Ejemplo: Entrada: 3, 7 → Salida: 10.
    */
    
    public static void main(String[] args) {
        
        //Variable para guardar el resultado
        int resultado;
        
        // Título
        System.out.println("_____________________________");
        System.out.println("|    SUMA DE DOS NUMEROS    |");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        // Llamada a la función suma
        resultado = suma(3, 7);
        System.out.println("La suma es: " + resultado);       
    }
    
    // Función para realizar la suma 
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
    
}
