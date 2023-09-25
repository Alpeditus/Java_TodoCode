package ejercicio.pkg7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int vector[] = new int [15];
        int cont = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el número para la posición " + i + ".");
            vector[i] = leer.nextInt();
            if (vector[i]==3) {
                cont++;
            }
        }
        System.out.println("El número 3 se cargó " + cont + " veces.");
    }
    
}
