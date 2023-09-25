package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dni, edad;
        String nombre;
        String categoria = "";

        System.out.println("Ingrese nombre:");
        nombre = leer.next();
        System.out.println("Ingrese edad:");
        edad = leer.nextInt();
        System.out.println("Ingrese dni:");
        dni = leer.nextInt();

        while (dni != 0 && !nombre.equals("fin")) {
            if (edad > 5 && edad < 11) {
                categoria = "Menores A.";
            } else {
                if (edad > 10 && edad < 18) {
                    categoria = "Menores B.";
                } else {
                    if (edad > 17 && edad < 31) {
                        categoria = "Juveniles.";
                    } else {
                        if (edad > 30 && edad < 51) {
                            categoria = "Adultos.";
                        } else {
                            if (edad > 50) {
                                categoria = "Adultos mayores.";
                            }
                        }
                    }
                }
            }
            System.out.println("Su categoría es: " + categoria);
            System.out.println("Ingrese nombre:");
            nombre = leer.next();
            System.out.println("Ingrese edad:");
            edad = leer.nextInt();
            System.out.println("Ingrese dni:");
            dni = leer.nextInt();
        }
    }
}
