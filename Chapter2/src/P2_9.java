import java.util.Scanner;

public class P2_9 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount, but in int form
        System.out.println("Enter an amount in int, for example 1156, last two digits for 0.56.");
        int amount = input.nextInt();

        int remainingAmount = amount;// a variable for transfer values

        // find the number of one dollars
        int numberOfDollars = amount/ 100;
        remainingAmount = remainingAmount % 100;

        // find the number of quarters in the reminning amount
        int numberOfQuarters = remainingAmount /25;
        remainingAmount = remainingAmount % 25;

        // find the number of dimes in the remaining amount
        int numberOfdimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of \n" +
                "\t" + numberOfDollars + " dollars\n" +
                "\t" + numberOfQuarters + " quarters\n" +
                "\t" + numberOfdimes + " dimes\n" +
                "\t" + numberOfNickels + " nickels\n" +
                "\t" + numberOfPennies + " pennies\n" );
    }
}
