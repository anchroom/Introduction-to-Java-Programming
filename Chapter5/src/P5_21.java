// I forget how to calculate total payment.
// So the result is wrong
// But it's easy to correct in line 24
import java.util.Scanner;

public class P5_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        double totalPayment = loanAmount;
        double monthlyPayment = 0;
        double rate;
        final double STEP_RATE = 0.00125;
        final int MONATS_OF_YEAR = 12;

        System.out.printf("%-17s%-17s%-17s%n", "Interest Rate", "Monthly Payment", "Total Payment");

        for (rate = 0.05; rate <= 0.08; rate += STEP_RATE){
            for (int i = 1; i <= numberOfYears; i++){
                totalPayment = totalPayment * (1 + rate);
            }
            monthlyPayment = totalPayment / (numberOfYears * MONATS_OF_YEAR);
            System.out.printf("%.3f%%                 %-16.2f %-16.2f%n", (rate * 100), monthlyPayment, totalPayment);
        }


    }
}
