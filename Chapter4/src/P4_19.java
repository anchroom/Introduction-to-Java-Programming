import java.util.Scanner;

public class P4_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String firstNineDigits = input.nextLine();

        int digit10 = (Integer.parseInt(String.valueOf(firstNineDigits.charAt(0))) * 1
                + Integer.parseInt(String.valueOf(firstNineDigits.charAt(1))) * 2
                + Integer.parseInt(String.valueOf(firstNineDigits.charAt(2))) * 3
                + Integer.parseInt(String.valueOf(firstNineDigits.charAt(3))) * 4
                + Integer.parseInt(String.valueOf(firstNineDigits.charAt(4))) * 5
                + Integer.parseInt(String.valueOf(firstNineDigits.charAt(5))) * 6
                + Integer.parseInt(String.valueOf(firstNineDigits.charAt(6))) * 7
                + Integer.parseInt(String.valueOf(firstNineDigits.charAt(7))) * 8
                + Integer.parseInt(String.valueOf(firstNineDigits.charAt(8))) * 9) % 11;
        String outputDigit10;
        if (digit10 == 10){
            outputDigit10 = "X";
        } else outputDigit10 = "" + digit10;

        // To test
        // System.out.println("The digit10 is: " + digit10 + " and the output is : " + outputDigit10);
        System.out.println("The ISBN-10 number is " + firstNineDigits + outputDigit10);

    }
}
