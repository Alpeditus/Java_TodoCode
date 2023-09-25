package ejercicio.pkg1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num1,num2,num3;
        num1 = 35;
        num2 = 20;
        System.out.println("Los valores antes del intercambio son: num1 = " + num1 + " y num2 = " + num2 + ".");
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Los valores después del intercambio son: num1 = " + num1 + " y num2 = " + num2 + ".");
    }
    
}
