package arrays.matrices;

import java.util.Scanner;

public class ArraysMatrices {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");  
                
        //Declaración
        int matriz [][] = new int [3][3];
        
        //Asignación (por teclado)
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la posición f: " + f + " c: " + c);
                matriz[f][c] = leer.nextInt();
            }
        }
        
        //Recorrido
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }
    }
    
}
