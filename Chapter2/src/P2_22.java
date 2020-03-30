import java.util.Scanner;

public class P2_22 {
    public static void main(String[] args){
        final double SIDE_CONSTANT = 3* Math.pow(3, 0.5)/2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = SIDE_CONSTANT* side* side;

        System.out.println("The area of the hexagon is " + area);
    }
}
