import java.util.Scanner;

public class P2_17 {
    public static void main(String[] args){
        final double CAL_CONSTANT_1 = 35.74;
        final double CAL_CONSTANT_2 = 0.6215;
        final double CAL_CONSTANT_3 = 35.75;
        final double CAL_CONSTANT_4 = 0.4275;

        //Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit (-58 ~ 41) : ");
        double raumTemperature = input.nextDouble();
        System.out.print("Enter the wind speed miles per hour (>=2) : ");
        double windSpeed = input.nextDouble();

        double windChillIndex = CAL_CONSTANT_1 + CAL_CONSTANT_2 * raumTemperature - CAL_CONSTANT_3 * Math.pow(windSpeed, 0.16) + CAL_CONSTANT_4 * raumTemperature * Math.pow(windSpeed, 0.16);
        System.out.print("The wind chill index is " + windChillIndex);
    }
}
