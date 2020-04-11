public class P5_3 {
    public static void main(String[] args){
        final double KILO_TO_POUNDS = 2.2;
        System.out.printf("%-10s%10s\n", "千克","磅");
        for (int i = 1; i < 200; i++){
            double pounds = i * KILO_TO_POUNDS;
            System.out.printf("%-10s %10.1f\n", i, pounds);
        }
    }
}
