public class P5_43 {
    public static void main(String[] args){
        int numberOfCombi = 0;

        for (int number1 = 1; number1 <= 7; number1++){
            for (int number2 = 1; number2 <= 7; number2++){
                if (number1 == number2){
                    continue;
                } else {
                    numberOfCombi++;
                    System.out.println(number1 + " " + number2);
                }
            }
        }
        System.out.println("The total number of all combinations is " + numberOfCombi);
    }
}
