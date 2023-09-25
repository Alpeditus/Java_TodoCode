package ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double matriz[][] = new double[4][4];
        double suma = 0;

        //for para cargar
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j != 3) {
                    System.out.println("Ingrese la " + (j + 1) + "° nota del " + (i + 1) + "° alumno:");
                    matriz[i][j] = leer.nextDouble();
                    suma = suma + matriz[i][j];
                } else {
                    matriz[i][j] = suma / 3;
                }
            }
            suma = 0;
        }

        //for para recorrer
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j != 3) {
                    System.out.println("La nota del alumno " + (i + 1) + " es: " + matriz[i][j] + ".");
                } else {
                    System.out.println("El promedio del alumno " + (i + 1) + " es: " + matriz[i][j] + ".");
                }
            }
        }
    }

}
