import java.util.Scanner;

public class P2_6 {
    public static void main (String[] args){
        int digits;

        System.out.println("Enter a number between 0 and 1000:");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        digits = (number/100) + (number/10%10) + (number%10);

        System.out.println("The sum of the digits is " + digits);
    }

}
