import java.util.Scanner;

public class P3_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Entera point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        final double MAX_X = 10 / 2;
        final double MAX_Y = 5 / 2;
        double distance = Math.pow((x*x + y*y) , 0.5);
        if((distance < MAX_X) && (distance < MAX_X)){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
    }
}
