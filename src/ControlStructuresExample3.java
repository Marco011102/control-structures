import java.lang.Math;
import java.util.Scanner;


public class ControlStructuresExample3 {
    public static void main(String[] args){

        double x = 0;
        boolean keepAskingNumbers = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite un número: ");

            int number = scanner.nextInt();
            if(number > 10 && number < 20){
                x = Math.pow(number, 2) + 2;
            } else {
                x = Math.pow(((number + 5) / 3), 2);
            }

            System.out.println("F(" + number + ") = " + x);

            keepAskingNumbers = !(x > 50 && x % 2 == 0);

        } while(keepAskingNumbers);

        System.out.println(
                "El programa ha terminado"
        );

    }
}
