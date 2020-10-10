import java.lang.Math;
import java.util.Scanner;

public class ControlStructuresExample4 {

    /**
     * En este metodo main, vamos a ver un ejemplo de una restructura de control
     * que se llama ciclo FOR. Esta nos permite ejecutar repeticiones de un bloque
     * de código una cantidad determinada de veces.
     *
     * @param args
     */
    public static void main(String[] args){

//        int counter = 0;
//
//        while(counter < 100){
//            System.out.println("El valor de counter es: " + counter);
//            counter++; // Tome el valor actual de counter e increméntelo en 1
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un número: ");

        int numberFromTheUser = scanner.nextInt();
        int squareRootFromUsersNumber = (int)Math.sqrt(numberFromTheUser);

        for(int counter = 2; counter <= squareRootFromUsersNumber; ++counter){
            if(numberFromTheUser % counter == 0){
                System.out.println("El número: " + counter + " es un divisor de: " + numberFromTheUser);
            }
            else{
                System.out.println("El número: " + counter + " NO es un divisor de: " + numberFromTheUser);
            }
        } // FOR ENDS

    } // METHOD MAIN ENDS

}
