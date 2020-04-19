import java.util.Scanner;

public class P5_30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of your account: ");
        double numberOfAccount = input.nextInt();
        System.out.print("Enter the yearly rate: ");
        double yearlyRate = input.nextDouble();
        System.out.print("Enter the month you want to see(1-12): ");
        int monthOfOutput = input.nextInt();

        double monthlyRate = yearlyRate /100 / 12;
        double currentAmount = numberOfAccount;
        for(int month = 1; month <= 12; month++){
            currentAmount = currentAmount * (1 + monthlyRate);
            if (month == monthOfOutput)break;
            currentAmount += numberOfAccount;
        }
        System.out.printf("The amount of %2dst month is %4.3f", monthOfOutput, currentAmount);
    }
}
