package reservaasientos;

import java.util.Scanner;

public class ReservaAsientos {

    public static void main(String[] args) {
        char asientos[][] = new char[10][10];
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);
        int fila, asiento;
        String respuesta;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                asientos[i][j] = 'L';
            }
        }

        System.out.println("-------BIENVENIDO AL SISTEMA DE RESERVAS-------");

        while (bandera != true) {
            System.out.println("Desea ver los asientos disponibles?");
            //acá vamos a llamar al método.
            
            dibujarMapa(asientos);

            System.out.println("Ingrese Fila y Asiento a reservar");
            System.out.print("Fila (entre 0 y 9): ");
            fila = leer.nextInt();

            System.out.print("Asiento (entre 0 y 9): ");
            asiento = leer.nextInt();

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente.");
            } else {
                System.out.println("El asiento está ocupado, por favor elija otro.");
            }

            System.out.println("Desea finalizar la reserva? S: si/Cualquier otra letra: NO.");
            respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }

        }

    }
    
    static void dibujarMapa(char asientos[][]){
        
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + asientos[i][j] + "]");
            }
            System.out.println("");
        }
        
        
    }

}
