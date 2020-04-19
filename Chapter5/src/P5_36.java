import java.util.Scanner;

public class P5_36 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int firstNineDigits = input.nextInt();

        int remainingamount = firstNineDigits;
        int digit = 0;
        int digit10 = 0;
        String outputDigit10;
        String output = "" ;
        int multiplier = 1;
        for(int i = 100000000; i >= 1; i /= 10){
            digit = (int) (remainingamount / i);
            remainingamount = firstNineDigits % i;
            output += ("" + digit);
            digit10 += (digit * multiplier);
            multiplier++;
            System.out.println(output + " and multiplier: " + multiplier+ " , digit10: " + digit10);

        }
        outputDigit10 = ((digit10 % 11) == 10)? "X":("" + (digit10 % 11));
        output = output + outputDigit10;

        System.out.println("The digit10 is: " + digit10 + " and the output is : " + outputDigit10);
        System.out.println("The ISBN-10 number is " + output);

    }

}
