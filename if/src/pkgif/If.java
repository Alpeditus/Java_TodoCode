package pkgif;

public class If {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        if (num2 > num1) {
            System.out.println("El num2 es mayor a num1.");
        } else {
            if (num1 == num2) {
                System.out.println("El num1 es igual a num2.");
            } else {
                System.out.println("El num2 es menor a num1.");
            }
            
        }
    }

}
