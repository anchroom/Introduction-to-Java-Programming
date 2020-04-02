import java.util.Scanner;

public class P3_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int firstNineDigits = input.nextInt();

        int remainingamount;
        int digit1 = (int) (firstNineDigits / 100000000);
        remainingamount = firstNineDigits % 100000000;

        int digit2 = (int) (remainingamount / 10000000);
        remainingamount = firstNineDigits % 10000000;

        int digit3 = (int) (remainingamount / 1000000);
        remainingamount = firstNineDigits % 1000000;

        int digit4 = (int) (remainingamount / 100000);
        remainingamount = firstNineDigits % 100000;

        int digit5 = (int) (remainingamount / 10000);
        remainingamount = firstNineDigits % 10000;

        int digit6 = (int) (remainingamount / 1000);
        remainingamount = firstNineDigits % 1000;

        int digit7 = (int) (remainingamount / 100);
        remainingamount = firstNineDigits % 100;

        int digit8 = (int) (remainingamount / 10);
        remainingamount = firstNineDigits % 10;

        int digit9 = remainingamount;
        remainingamount = 0;

        int digit10 = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
        String outputDigit10;
        if (digit10 == 10){
            outputDigit10 = "X";
        } else outputDigit10 = "" + digit10;

        System.out.println("The digit10 is: " + digit10 + " and the output is : " + outputDigit10);
        System.out.println("The ISBN-10 number is " + firstNineDigits + outputDigit10);

    }
}
