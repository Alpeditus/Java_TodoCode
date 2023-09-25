package ejercicio.pkg12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //creamos la matriz
        int vuelos[][] = new int[6][3];

        //cargamos la matriz
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.println("Ingrese al cantidad de asientos para el destino: " + i + " horario " + j + ".");
                vuelos[i][j] = (int) (Math.random() * 50) + 1;
            }
        }

        //venta de asientos
        Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
        String bandera = "";
        int destino, horario, asientos;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Lista de asientos disponibles:");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" [" + vuelos[i][j] + "] ");
                }
                System.out.println("");
            }

            System.out.println("Ingrese el n° de destino.");
            destino = leer.nextInt();
            System.out.println("Ingrese el horario de vuelo.");
            horario = leer.nextInt();
            System.out.println("Ingrese la cantidad de asientos.");
            asientos = leer.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con éxito.");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles.");
                    }
                } else {
                    System.out.println("Horario no existente. Ingrese entre 0 y 2.");
                }
            } else {
                System.out.println("Destino no existente. Ingrese entre 0 y 5.");
            }
            System.out.println("¿Desea continuar reservando? Ingrese finish pra terminar o "
                    + "cualquier valor para seguir.");
            bandera = leer2.next();
        }
    }
}
