package ejercicio.pkg6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        //declarar la altura del árbol
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la altura del árbol:");
        int altura = leer.nextInt();

        //buble para recorrer todas las filas (altura)
        for (int fila = 0; fila < altura; fila++) {

            //bucle para los espacios
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            //bucle para los asteriscos
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //tronco
        int largoTronco;
        if (altura>5) {
            largoTronco = 2;
        } else {
            largoTronco = 1;
        }
        for (int base = 0; base < largoTronco; base++) {

            //espacios en blanco
            for (int espacio = 0; espacio < (altura - 2); espacio++) {
                System.out.print(" ");
            }
            //barritas tronco
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }

}
