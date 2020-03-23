import javax.swing.*;
import java.util.Scanner;

public class P2_10 {
    public static void main(String[] args){
        // Create a window for input
        String input = JOptionPane.showInputDialog(null,
                "Enter a mount in int form, for example 1156, last two digits for 0.56.",
                "Money change",
                JOptionPane.QUESTION_MESSAGE);

        // transfer input from String to int
        int amount = Integer.parseInt(input);

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
        String output = "Your amount " + amount + " consists of \n" +
                "\t" + numberOfDollars + " dollars\n" +
                "\t" + numberOfQuarters + " quarters\n" +
                "\t" + numberOfdimes + " dimes\n" +
                "\t" + numberOfNickels + " nickels\n" +
                "\t" + numberOfPennies + " pennies\n" ;
        JOptionPane.showMessageDialog(null,output);
    }
}
