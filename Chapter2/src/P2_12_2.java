import java.util.Scanner;

public class P2_12_2 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");

        double balance = input.nextDouble();
        double rate = input.nextDouble();

        //calculate
        double interest = balance * (rate/1200);

        //display output
        System.out.println("The interest is " + interest);
    }
}
