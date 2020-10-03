import java.lang.Math;
import java.util.Scanner;

public class ControlStructuresExample2 {

    public static void main(String[] args) {

        // Greater than (Mayor que)  a > b
        // Less than (Menor que)     a < b
        // Greater or equal (Mayor o igual que)  a >= b
        // Less or equal than (Menor or igual) a <= b
        // Equals (Igual) a == b
        // Not equal (Distinto) a != b

//        int x = -5;
//
//        int result = 0;
//
//
//        if(x > 1){
//            result = x + 1;
//        } else if(x <= 1){
//            result = 2 * x + 1;
//        }
//
//        System.out.println("El valor final de result es: " + result);

        boolean keepAskingForNumbers = true;

        while (keepAskingForNumbers) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite un número: ");

            int x = scanner.nextInt();

            if (x != 0) {

                double result = 0;

                if (x == 5) {
                    result = (Math.pow(x, 2.0) + 1) / 2.0;
                } else if (x > 5) {
                    result = Math.pow((x / 2.0), 2.0);
                } else if (x < 5) {
                    result = Math.pow(x, 3.0) + 3.0;
                } // ELSE ENDS

                System.out.println("F(" + x + ") = " + result);
            } else {
                // Esto se ejecuta si x == 0
                keepAskingForNumbers = false;
            } // ELSE ENDS
        } // WHILE ENDS
        System.out.println("El programa a finalizado");
    }
}
