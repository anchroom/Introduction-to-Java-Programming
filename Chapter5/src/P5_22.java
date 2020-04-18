// this is similar to 21, but how to calculate monthlyPayment is not clear, so ignore this.
import java.util.Scanner;

public class P5_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double monthlyRate = input.nextDouble();

        double monthlyPayment = 0;
        double rate = monthlyRate / 100;
        double interest;
        double balance = 0.0;
        double principal;
        final int MONATS_OF_YEAR = 12;

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for (int i = 1; i <= numberOfYears * MONATS_OF_YEAR; i++){
            monthlyPayment = loanAmount * rate / (1 - 1 / Math.pow(1 + rate, numberOfYears * MONATS_OF_YEAR));
            interest = rate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);

        }

    }
}
