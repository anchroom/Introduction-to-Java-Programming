import java.util.Scanner;

public class P5_38 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int numberIn10 = input.nextInt();

        int remainingamount = numberIn10;
        String outputIn8 = "";
        int digit;
        do {
            digit = remainingamount % 8;
            remainingamount = (int)(remainingamount / 8);
            outputIn8 = "" + digit + outputIn8;

            System.out.println(outputIn8);
        } while (remainingamount != 0);
        System.out.println(numberIn10 + " in octonary is: " + outputIn8);
    }
}
