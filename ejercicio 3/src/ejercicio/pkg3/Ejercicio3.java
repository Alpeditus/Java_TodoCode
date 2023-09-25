package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numLimite;
        
        System.out.println("Ingrese el número límite:");
        numLimite = leer.nextInt();

        for (int i = 1; i <= numLimite; i++) {
            System.out.println(i);

        }
    }
}
