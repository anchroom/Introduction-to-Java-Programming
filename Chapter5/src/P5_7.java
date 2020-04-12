public class P5_7 {
    public static void main(String[] args){
        double studentkosten = 10000.0;
        final double RATE = 1.05;
        final int YEARS = 10;

        // To compute the kosten of student
        for(int i = 1; i <= YEARS; i++){
            studentkosten = studentkosten * RATE;
        }
        System.out.println("After 10 years: " + studentkosten);

        double sum = studentkosten;
        for(int i = 1; i <= 4; i++){
            studentkosten = studentkosten * RATE;
            sum += studentkosten;
        }

        System.out.println("The studentkosten of 10 years later is " + studentkosten + " , and the sum of 4 years is: " + sum);

    }
}
