public class P5_39 {

    public static void main(String[] args) {

        final double UMSATZ_STUFE_1 = 5000.00;
        final double UMSATZ_STUFE_2 = 10000.00;
        final double PAYMENTRATE_STUFE_1 = 0.08;
        final double PAYMENTRATE_STUFE_2 = 0.10;
        final double PAYMENTRATE_STUFE_3 = 0.12;
        double payment = 1.0;
        double salesAmount = 1.0;

        do {
            if (salesAmount <= UMSATZ_STUFE_1) {
                payment = salesAmount * PAYMENTRATE_STUFE_1;
            } else if (salesAmount <= UMSATZ_STUFE_2) {
                payment = UMSATZ_STUFE_1 * PAYMENTRATE_STUFE_1 + (salesAmount - UMSATZ_STUFE_1) * PAYMENTRATE_STUFE_2;
            } else
                payment = UMSATZ_STUFE_1 * PAYMENTRATE_STUFE_1 + (UMSATZ_STUFE_2 - UMSATZ_STUFE_1) * PAYMENTRATE_STUFE_2
                        + (salesAmount - UMSATZ_STUFE_2) * PAYMENTRATE_STUFE_3;
            salesAmount++;
            System.out.println("payment is: " + payment);
        } while ((payment * 12) < 30000) ;
        System.out.println("Sales must be more than " + salesAmount);
    }
}
