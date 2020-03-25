import java.util.Scanner;

public class P2_16 {
    public static void main(String[] args){
        //Create Scanner
        final int CALCULATE_CONSTANT = 4184;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double weightOfWater = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double energy = weightOfWater * (finalTemperature - initialTemperature) * CALCULATE_CONSTANT;

        System.out.print("The energy needed is " + energy);
    }
}
