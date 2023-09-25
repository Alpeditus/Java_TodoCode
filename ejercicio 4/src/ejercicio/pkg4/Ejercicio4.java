package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;

        System.out.println("Ingrese una palabra:");
        palabra = leer.next();
        
        while (!palabra.equals("salir")) {
            System.out.println(palabra);
            System.out.println("Ingrese otra palabra.");
            palabra = leer.next();
        }
        System.out.println("Adios.");
    }

}
