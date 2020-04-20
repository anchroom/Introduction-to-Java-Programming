import java.util.Scanner;

public class P5_42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the commission sought : ");
        double commissionSought = in.nextDouble();
        double salesAmount = 1.0;

        for (salesAmount = 1; (salesAmountToPayment(salesAmount) * 12) < commissionSought; salesAmount++){
            System.out.println("payment is: " + salesAmountToPayment(salesAmount));
        }
        System.out.println("Sales must be more than " + salesAmount);
    }

    private static double salesAmountToPayment(double salesAmount){
        final double UMSATZ_STUFE_1 = 5000.00;
        final double UMSATZ_STUFE_2 = 10000.00;
        final double PAYMENTRATE_STUFE_1 = 0.08;
        final double PAYMENTRATE_STUFE_2 = 0.10;
        final double PAYMENTRATE_STUFE_3 = 0.12;

        double payment;

        if (salesAmount <= UMSATZ_STUFE_1) {
            payment = salesAmount * PAYMENTRATE_STUFE_1;
        } else if (salesAmount <= UMSATZ_STUFE_2) {
            payment = UMSATZ_STUFE_1 * PAYMENTRATE_STUFE_1 + (salesAmount - UMSATZ_STUFE_1) * PAYMENTRATE_STUFE_2;
        } else
            payment = UMSATZ_STUFE_1 * PAYMENTRATE_STUFE_1 + (UMSATZ_STUFE_2 - UMSATZ_STUFE_1) * PAYMENTRATE_STUFE_2
                    + (salesAmount - UMSATZ_STUFE_2) * PAYMENTRATE_STUFE_3;
        return payment;
    }
}
