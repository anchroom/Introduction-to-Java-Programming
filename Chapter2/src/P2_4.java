import java.util.Scanner;

public class P2_4 {
    public static void main(String[] args){
        final double POUND_TO_KILO = 0.454;
        double kilo;
        //input cue line
        System.out.print("Enter a value in pounds:");

        //read input
        Scanner input = new Scanner(System.in);
        double pound = input.nextDouble();
        //calculate
        kilo = pound * POUND_TO_KILO;
        //Result output
        System.out.println(pound  + " pound is " + kilo + " kilograms.");
    }
}
