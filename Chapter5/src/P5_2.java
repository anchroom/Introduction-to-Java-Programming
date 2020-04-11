import java.util.Scanner;

public class P5_2 {
    public static void main(String[] args){
        final int NUMBER_OF_QUESTIONS = 10;
        String output = "";
        long startTime = System.currentTimeMillis();
        int count = 0;
        int numberOfRightAnswer = 0;

        // Create Scanner
        Scanner scan = new Scanner(System.in);

        while (count < 10){
            // To generate two random numbers
            int number1 = (int) (Math.random() * 15 + 1);
            int number2 = (int) (Math.random() * 15 + 1);
            System.out.print(number1 + " + " + number2 + "=: ");
            int answer = scan.nextInt();
            if (answer == (number1 + number2)) {
                System.out.println("You are right!");
                numberOfRightAnswer += 1;
            } else {
                System.out.println("Your answer is wrong!\n" + number1 + " + " + number2 + " = " + (number1 + number2) +"\n");
            }
            count ++;
            output += "\n" + number1 + " + " + number2 + " = " + answer + ((answer == (number1 + number2))? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + numberOfRightAnswer);
        System.out.println("Test time is " + testTime/1000 + " seconds");
        System.out.println(output);
    }
}
