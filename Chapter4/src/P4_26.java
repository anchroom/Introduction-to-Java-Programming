import javax.swing.*;

public class P4_26 {
    public static void main(String[] args){
        // Create a window for input
        String input = JOptionPane.showInputDialog(null,
                "Enter a mount in int form, for example 11.56: ",
                "Money change",
                JOptionPane.QUESTION_MESSAGE);

        // transfer input from String to int
        int amount1 = Integer.parseInt(input.substring(0,((input.indexOf('.')))));
        int amount2 = Integer.parseInt(input.substring(((input.indexOf('.')) + 1)));

        int remainingAmount = amount2;// a variable for transfer values
        String and; // if remainingAmount is not 0

        // find the number of one dollars
        int numberOfDollars = amount1;
        String outputOfDollars;
        if (numberOfDollars == 0) {
            outputOfDollars = "";
        } else if (numberOfDollars == 1) {
            outputOfDollars = "1 Dollar" + outputand(remainingAmount);
        } else {
            outputOfDollars = numberOfDollars + " Dollars" + outputand(remainingAmount);
        }

        // find the number of quarters in the reminning amount
        int numberOfQuarters = amount2 /25;
        remainingAmount = amount2 % 25;
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
        String output = "Your amount " + amount1 + "." + amount2 + " consists of " + outputOfDollars + outputOfQuarters + outputOfDimes + outputOfNickels + outputOfPennies + ". amount1 and amount2 are: " + amount1 + " and " + amount2 + " and input is " + input;
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
