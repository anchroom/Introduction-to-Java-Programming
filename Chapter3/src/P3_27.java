import java.util.Scanner;

public class P3_27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y- coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        final double KONSTANT = -0.5;

        if ((x > 200) || (y > 100) || (x < 0) || (y < 0) || (y > (KONSTANT * x + 100))){
            System.out.println("The point is not in the triangle");
        } else System.out.println("The point is in the triangle");
    }
}
