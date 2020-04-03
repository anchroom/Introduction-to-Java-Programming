import java.util.Scanner;

public class P3_15 {
    public static void main(String[] args){
        // Generate a lottery number
        int lottery = (int) (Math.random() * 1000);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        //Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery % 100) / 10;
        int lotteryDigit3 = lottery % 100;

        //Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = guess % 100;

        // To check your guess
        if (guess == lottery){
            System.out.print("Exact match: you win $10,000\n");
        } else if (((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3))
                && ((guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit3) || (guessDigit2 == lotteryDigit2))
                && ((guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit1) || (guessDigit3 == lotteryDigit3))){
            System.out.print("Match all digits: you win $3,000\n");
        } else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3)
                || (guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit3) || (guessDigit2 == lotteryDigit2)
                || (guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit3) || (guessDigit3 == lotteryDigit1)){
            System.out.print("Match one digit: you win $1,000\n");
        } else
            System.out.print("Sorry, no match.\n");

        System.out.print("Lottery is " + lottery + " and your guess is " + guess);
    }
}
