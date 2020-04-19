import java.util.Scanner;

public class P5_31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of your investition: ");
        double numberOfAccount = input.nextDouble();
        System.out.print("Enter the yearly rate: ");
        double yearlyRate = input.nextDouble();
        System.out.print("Enter the month you want to see: ");
        int monthOfOutput = input.nextInt();

        double monthlyRate = yearlyRate /100 / 12;
        double currentAmount = numberOfAccount;
        System.out.println("Month  CD Value");
        for(int month = 1; month <= monthOfOutput; month++){
            currentAmount += currentAmount * monthlyRate;
            System.out.printf("%-5d  %5.2f\n", month, currentAmount);
        }
    }

}
