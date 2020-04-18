public class P5_23 {
    public static void main(String[] args){
        final int TEST_MAX_VALUE = 50000;
        double sum1 = 0.0;
        double sum2 = 0.0;

        // from left to right
        for (int i = 1; i <= TEST_MAX_VALUE; i++){
            sum1 += 1.0/i;
        }

        // from right to left
        for (int i = TEST_MAX_VALUE; i >= 1; i++){
            sum2 += 1.0/i;
        }

        double difference = sum1 - sum2;
        System.out.printf("sum1 is %20.20f, and sum2 is %20.20f" ,sum1 ,sum2);
    }
}
