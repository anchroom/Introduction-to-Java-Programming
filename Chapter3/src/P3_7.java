// The judgement of output is too much and redudant, use another function is besser,
// and also another one for the status of "and"

import javax.swing.*;

public class P3_7 {
    public static void main(String[] args){
            // Create a window for input
            String input = JOptionPane.showInputDialog(null,
                    "Enter a mount in int form, for example 1156, last two digits for 0.56.",
                    "Money change",
                    JOptionPane.QUESTION_MESSAGE);

            // transfer input from String to int
            int amount = Integer.parseInt(input);

            int remainingAmount = amount;// a variable for transfer values
            String and; // if remainingAmount is not 0

            // find the number of one dollars
            int numberOfDollars = amount/ 100;
            remainingAmount = remainingAmount % 100;
            String outputOfDollars;
            if (numberOfDollars == 0) {
                outputOfDollars = "";
            } else if (numberOfDollars == 1) {
                outputOfDollars = "1 Dollar" + outputand(remainingAmount);
            } else {
                outputOfDollars = numberOfDollars + " Dollars" + outputand(remainingAmount);
            }

            // find the number of quarters in the reminning amount
            int numberOfQuarters = remainingAmount /25;
            remainingAmount = remainingAmount % 25;
            String outputOfQuarters;
            if (numberOfQuarters == 0) {
                outputOfQuarters = "";
            } else if (numberOfQuarters == 1) {
                outputOfQuarters = "1 Quarter" + outputand(remainingAmount);
            } else {
                outputOfQuarters = numberOfQuarters + " Quarters" + outputand(remainingAmount);
            }

            // find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;
            String outputOfDimes;
            if (numberOfDimes == 0) {
                outputOfDimes = "";
            } else if (numberOfDimes == 0) {
                outputOfDimes = "1 Dime" + outputand(remainingAmount);
            } else {
                outputOfDimes = numberOfDimes + " Dimes" + outputand(remainingAmount);
            }

            // find the number of nickels in the remaining amount
            int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;
            String outputOfNickels;
            if (numberOfNickels == 0) {
                outputOfNickels = "";
            } else if (numberOfNickels == 1) {
                outputOfNickels = "1 Nickel" + outputand(remainingAmount);
            } else {
                outputOfNickels = numberOfNickels + " Nickels" + outputand(remainingAmount);
            }

            // find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;
            remainingAmount = 0;
            String outputOfPennies;
            if (numberOfPennies == 0) {
                outputOfPennies = "";
            } else if (numberOfPennies == 1) {
                outputOfPennies = "1 Penny" + outputand(remainingAmount);
            } else  {
                outputOfPennies = numberOfPennies + " Pennies" + outputand(remainingAmount);
            }

            // Display results
            String output = "Your amount " + amount + " consists of " + outputOfDollars + outputOfQuarters + outputOfDimes + outputOfNickels + outputOfPennies;
            JOptionPane.showMessageDialog(null,output);
    }

    // check if remainingAmount is 0, and make "and"
    private static String outputand(double remainingAmount) {
        String and;
        if (remainingAmount == 0){
            and = "";
        } else {
            and = " and ";
        }
        return and;
    }


}
