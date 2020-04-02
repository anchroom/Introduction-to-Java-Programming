import java.util.Scanner;

public class P3_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int remainingAmount;

        int digit1 = (int) (number / 100);
        remainingAmount = number % 100;

        int digit2 = (int) (remainingAmount) / 10;
        remainingAmount = remainingAmount % 10;

        int digit3 = remainingAmount;

        String outputOfPalindrome;
        if(digit1 == digit3){
            outputOfPalindrome = " a ";
        } else outputOfPalindrome = " not a ";

        System.out.print(number + " is" + outputOfPalindrome + "palindrome.");
    }
}
