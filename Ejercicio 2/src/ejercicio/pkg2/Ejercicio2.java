package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double tipoSueldo = 0;
        int categoria;

        System.out.println("El sueldo de que tipo de empleado desea calcular:");
        System.out.println("1 - repositor.");
        System.out.println("2 - cajero.");
        System.out.println("3 - supervisor.");
        categoria = leer.nextInt();

        if (categoria == 1) {
            tipoSueldo = 15890 + (15890 * 0.1);
        } else {
            if (categoria == 2) {
                tipoSueldo = 25630.89;
            } else {
                if (categoria == 3) {
                    tipoSueldo = 35560.2 - (35560.2 * 0.11);
                }
            }
        }
        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("El sueldo para la catería " + categoria + " es: " + tipoSueldo + ".");
        } else {
            System.out.println("Número mal ingresado.");
        }
    }

}
