import java.util.Scanner;

public class P3_6 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter feet: ");
        double heightInFeet = input.nextDouble();
        System.out.print("Enter inches: ");
        double heightInInch = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METER_PER_INCH = 0.0254; // Constant
        final double FEET_PER_INCH = 12.0; // Constant

        //Compute BMI
        double weightInKilo = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeter = (heightInFeet * FEET_PER_INCH + heightInInch) * METER_PER_INCH;
        double valueBMI = weightInKilo / (heightInMeter * heightInMeter);

        //Display
        System.out.println("BMI is " + valueBMI);
        if (valueBMI < 18.5) {
            System.out.println("Underweight");
        } else if (valueBMI < 25) {
            System.out.println("Normal");
        } else if (valueBMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
