//PROBLEM!!!
//The result is not the same.
//When somebody find the problem, please make a commit, thank you!

import java.util.Scanner;

public class P2_13 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount:");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter monthly interest rate:");
        double annuallyInterestRate = input.nextDouble();

        System.out.println("Enter number of years:");
        int numberOfYears = input.nextInt();

        double mittleWert = Math.pow((1+annuallyInterestRate),(numberOfYears*12));

        double futureInvestmentValue = investmentAmount * mittleWert;
        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}
