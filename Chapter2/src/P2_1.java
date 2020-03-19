import java.util.Scanner;

public class P2_1 {
    public static void main(String[] args){
        final double NINE_DEVIDED_BY_FIVE = 1.8;//@param for (9/5)
        final double THIRTY_TWO = 32.0;
        double fahrenheit;
        //input cue line
        System.out.print("Enter a degree in Celsius:");

        //read input
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        //calculate
        fahrenheit = NINE_DEVIDED_BY_FIVE * celsius + THIRTY_TWO;
        //Result output
        System.out.println(celsius + " Celsuis is " + fahrenheit + " Fahrenheit.");
    }
}
