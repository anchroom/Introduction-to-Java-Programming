import java.util.Scanner;

public class P5_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        int numOfPositives = 0;
        int numOfNegatives = 0;
        double sum = 0;
        double average = 0.0;

        // check if the input is only 0
        if (number == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            // keep reading number until the input is 0
             do {
                sum += number;
                number = input.nextInt();
                if (number < 0){
                    numOfNegatives += 1;
                } else {
                    numOfPositives += 1;
                }
                average = sum / (numOfNegatives + numOfPositives);
            } while (number != 0);

            System.out.println("The number of positives is " + numOfPositives);
            System.out.println("The number of negatives is " + numOfNegatives);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);
        }
    }
}
