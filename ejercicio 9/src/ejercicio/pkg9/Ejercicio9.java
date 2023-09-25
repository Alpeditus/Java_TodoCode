package ejercicio.pkg9;

public class Ejercicio9 {

    public static void main(String[] args) {
        String vector[] = new String [8];
        
        //Asignación manual.
        vector[0] = "Alejandra";
        vector[1] = "Leonardo";
        vector[2] = "Rosa";
        vector[3] = "Guillermo";
        vector[4] = "Gabriel";
        vector[5] = "Daniel";
        vector[6] = "Luisa";
        vector[7] = "Ludmila";
        
        //Recorrido.
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El nombre en la posición " + i + " es: " + vector[i] + ".");
        }
    }
        
}
