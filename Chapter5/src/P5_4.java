public class P5_4 {
    public static void main(String[] args){
        final double MILE_TO_KILO = 1.609;
        System.out.printf("%-10s%10s\n", "英里","千米");
        for (int i = 1; i < 11; i++){
            double kilometer = i * MILE_TO_KILO;
            System.out.printf("%-10d %10.3f\n", i, kilometer);
        }
    }
}
