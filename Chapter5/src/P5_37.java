import java.util.Scanner;

public class P5_37 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int numberIn10 = input.nextInt();

        int remainingamount = numberIn10;
        String outputIn2 = "";
        int digit;
        do {
            digit = remainingamount % 2;
            remainingamount = (int)(remainingamount / 2);
            outputIn2 = "" + digit + outputIn2;

            System.out.println(outputIn2);
        } while (remainingamount != 0);
        System.out.println(numberIn10 + " in binary is: " + outputIn2);
    }
}
