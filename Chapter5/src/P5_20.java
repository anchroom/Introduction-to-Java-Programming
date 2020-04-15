import java.security.KeyStore;

public class P5_20 {
    public static void main(String[] args){
        final int NUMBER_PER_LINE = 8;
        int count = 0;
        int number;
        for (number = 2; number <= 1000; number++){
            if (P5_20.isPrime(number)){
                count++;
                if(count < NUMBER_PER_LINE){
                    System.out.printf("%5d", number);
                } else {
                    count = 1;
                    System.out.printf("\n%5d" , number);
                }
            }
        }
    }

    // To check if it is a prime number
    private static boolean isPrime(int number){
        int countOfQuotient = 0;
        boolean statusOfIsPrime = true;
        for (int i = 3; i < number; i++){
            if ((number % i) == 0){
                statusOfIsPrime = false;
            }
        }
        return statusOfIsPrime;
    }
}

