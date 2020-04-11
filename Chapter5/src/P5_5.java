public class P5_5 {
    public static void main(String[] args){
        final double KILO_TO_POUNDS = 2.2;
        int pounds = 20;
        System.out.printf("%-10s%10s          %-10s%10s\n", "千克","磅","磅","千克");
        for (int kilo = 1; kilo < 200; kilo += 2){
            System.out.printf("%-10d  %10.1f          %-10d  %10.2f\n", kilo, kilo * KILO_TO_POUNDS, pounds , pounds/KILO_TO_POUNDS);
            pounds += 5;
        }
    }
}
