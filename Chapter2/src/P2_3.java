import java.util.Scanner;

public class P2_3 {
    public static void main(String[] args){
        final double FEET_TO_METER = 0.305;
        double meter;
        //input cue line
        System.out.print("Enter a value for feet:");

        //read input
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        //calculate
        meter = feet * FEET_TO_METER;
        //Result output
        System.out.println(feet + " feet is " + meter + " meters.");
    }
}
