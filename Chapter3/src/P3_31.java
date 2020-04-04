import java.util.Scanner;

public class P3_31 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rateOfExchange = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int statusOfExchange = input.nextInt();

        double amountOfDollar;
        double amountOfRMB;

        if (statusOfExchange == 0) {
            System.out.print("Enter the dollar amount: ");
            amountOfDollar = input.nextDouble();
            amountOfRMB = amountOfDollar * rateOfExchange;
            System.out.println("$" + amountOfDollar + " is " + amountOfRMB + " yuan.");
        } else {
            System.out.print("Enter the RMB amount: ");
            amountOfRMB = input.nextDouble();
            amountOfDollar = amountOfRMB / rateOfExchange;
            System.out.println(amountOfRMB + "yuan is $" + amountOfDollar);
        }
    }
}
