public class ControlStructuresExample1 {
    public static void main(String[] args){

        boolean itIsRaining = true;
        boolean weAreLearningJava = true;
        boolean weAreInAParty = false;
        boolean thereIsNoPandemia = false;

        int magicNumber = -1;

        // Greater than (Mayor que)  a > b
        // Less than (Menor que)     a < b
        // Greater or equal (Mayor o igual que)  a >= b
        // Less or equal than (Menor or igual) a <= b
        // Equals (Igual) a == b
        // Not equal (Distinto) a != b

        if(itIsRaining || weAreInAParty && magicNumber >= -1){
            magicNumber = 10;
            System.out.println("Está lloviendo y estamos en una fiesta");
            System.out.println("The current magic number is: " + magicNumber);
        }

    }
}
