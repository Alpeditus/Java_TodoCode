package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
        
        //creamos los 3 vectores
        String ciudades[] = new String[5];
        double minimas[] = new double[5];
        double maximas[] = new double[5];
        
        //cargar los vectores
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese la " + (i+1) + "° ciudad:");
            ciudades[i] = leer.next();
            System.out.println("Ingrese la temperatura mínima:");
            minimas[i] = leer2.nextDouble();
            System.out.println("Ingrese la temperatura máxima:");
            maximas[i] = leer2.nextDouble();
        }
        
        double minima = Double.MAX_VALUE;
        int posMin = -1;
        double maxima = Double.MIN_VALUE;
        int posMax = -1;
        //determinamos la mínima
        for (int i = 0; i < ciudades.length; i++) {
            if (minimas[i] < minima) {
                minima = minimas[i];
                posMin = i;
            }
            if (maximas[i] > maxima) {
                maxima = maximas[i];
                posMax = i;
            }
        }
        
        //Respuesta
        System.out.println("La temperatura mínima es de: " + minima + ".");
        System.out.println("Se registró en la ciudad de: " + ciudades[posMin] + ".");
        System.out.println("La temperatura máxima es de: " + maxima + ".");
        System.out.println("Se registró en la ciudad de: " + ciudades[posMax] + ".");
    }
    
}
