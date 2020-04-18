public class P5_25 {
    public static void main(String[] args){
        final int TEST_VALUE_1 = 10000;
        final int TEST_VALUE_2 = 20000;
        final int TEST_VALUE_3 = 100000;
        double sum1 = 0.0;
        double sum2 = 0.0;
        double sum3 = 0.0;
        double pi1 = 0.0;
        double pi2 = 0.0;
        double pi3 = 0.0;

        for(int i=1; i <= TEST_VALUE_1; i++){
            double currentvalue = (Math.pow((-1.0),(i+1)))/ (2 * i - 1);
            sum1 += currentvalue;
            pi1 = 4 * sum1;
        }

        for(int i=1; i <= TEST_VALUE_2; i++){
            double currentvalue = (Math.pow((-1.0),(i+1)))/ (2 * i - 1);
            sum2 += currentvalue;
            pi2 = 4 * sum2;
        }

        for(int i=1; i <= TEST_VALUE_3; i++){
            double currentvalue = (Math.pow((-1.0),(i+1)))/ (2 * i - 1);
            sum3 += currentvalue;
            pi3 = 4 * sum3;
        }

        System.out.printf("PI1 is %4.30f\nPI2 is %4.30f\nPI3 is %4.30f", pi1, pi2, pi3);
    }
}
