import java.util.Scanner;

public class P2_14 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPound = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInch = input.nextDouble();

        double weightInKilo = 0.45359237 * weightInPound;
        double heightInMeter = 0.0254 * heightInInch;

        double valueOfBMI = weightInKilo / (heightInMeter * heightInMeter);
        System.out.print("BMI is " + valueOfBMI);
    }
}
