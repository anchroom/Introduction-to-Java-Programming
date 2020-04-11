public class P5_6 {
    public static void main(String[] args){
        final double MILE_TO_KILOS = 1.609;
        int kilo = 20;
        System.out.printf("%-10s%8s          %-10s%8s\n", "英里","千米","千米","英里");
        for (int mile = 1; mile < 11; mile++){
            System.out.printf("%-10d  %-10.3f          %-10d  %-10.3f\n", mile, mile * MILE_TO_KILOS, kilo , kilo/MILE_TO_KILOS);
            kilo += 5;
        }
    }
}
