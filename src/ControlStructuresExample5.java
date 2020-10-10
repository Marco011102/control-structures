import java.util.Scanner;

public class ControlStructuresExample5 {
    public static void main(String[] args){

        int numberProvidedByTheUser = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite un número entre 2 y 9: ");
            numberProvidedByTheUser = scanner.nextInt();
        } while(!(numberProvidedByTheUser > 2 && numberProvidedByTheUser < 10));

        for(int firstMultiple = 1; firstMultiple <= numberProvidedByTheUser; ++firstMultiple){
            for(int secondMultiple = 0; secondMultiple <= 10; ++secondMultiple){
                System.out.println("[" + firstMultiple + " X " + secondMultiple + "] = " + firstMultiple * secondMultiple);
            } // FOR ENDS (SECOND MULTIPLE)
        } // FOR ENDS (FIRST MULTIPLE)

    } // METHOD MAIN ENDS
} // CLASS CONTROL STRUCTURES EXAMPLE 5 ENDS
