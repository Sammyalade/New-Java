import java.util.*;

public class AsteriskDisplay {

    public static void main(String[] args) {

        Scanner collector = new Scanner(System.in);

        int userInput = 0;
        int indexLength = 0;
        ArrayList<Integer> saveAndDisplayNumber = new ArrayList<>();

        while (userInput != 22){
            System.out.println("""
            Enter a number between 1 and 15.
            Enter 22 to cancel
            """);
            try {
                userInput = collector.nextInt();
                if(userInput < 1 || userInput > 15 && (userInput != 22)){
                    System.out.println("You entered the wrong input. Please enter a number between 1 and 15");
                }
                else {
                    saveAndDisplayNumber.add(userInput);
                    indexLength++;
                }
            } catch (InputMismatchException exception){
                System.out.println("Enter integer values only");
                collector.next();
            }
        }


        for (int value : saveAndDisplayNumber) {
            for (int asterisks = 0; asterisks < value; asterisks++) {
                if(value != 22) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}