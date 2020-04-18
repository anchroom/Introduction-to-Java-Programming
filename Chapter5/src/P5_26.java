public class P5_26 {
    public static void main(String[] args){
        final int TEST_VALUE_1 = 10000;
        final int TEST_VALUE_2 = 20000;
        final int TEST_VALUE_3 = 100000;
        double item1 = 1.0;
        double item2 = 1.0;
        double item3 = 1.0;
        double sum1 = 1.0;
        double sum2 = 1.0;
        double sum3 = 1.0;

        for(int i=1; i <= TEST_VALUE_1; i++){
            item1 = item1 * (1.0 / i);
            sum1 += item1;
        }

        for(int i=1; i <= TEST_VALUE_2; i++){
            item2 = item2 * (1.0 / i);
            sum2 += item2;
        }

        for(int i=1; i <= TEST_VALUE_3; i++){
            item3 = item3 * (1.0 / i);
            sum3 += item3;
        }

        System.out.printf("Sum1 is %4.30f\nSum2 is %4.30f\nSum3 is %4.30f", sum1, sum2, sum3);
    }
}
