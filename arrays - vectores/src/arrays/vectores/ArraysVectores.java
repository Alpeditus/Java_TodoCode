package arrays.vectores;

import java.util.Scanner;

public class ArraysVectores {

    public static void main(String[] args) {
       //Declaración
       int vector [] = new int [4];
       int vector2 [] = new int [4];
       
       //Asignación (manual)
       vector[0]=2;
       vector[1]=35;
       vector[2]=48;
       vector[3]=157;
       
       //Asignación (por teclado)
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el índice: " + i + ".");
            vector[i] = leer.nextInt();
        }
       
       //Recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el índice: " + i + ".");
            System.out.println("Tengo guardado un " + vector[i] + ".");
            System.out.println("----------------");
        }
    }
    
}
