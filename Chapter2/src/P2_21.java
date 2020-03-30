//The result of area is not right

import java.io.PrintStream;
import java.util.Scanner;

public class P2_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = distance(x1,y1,x2,y2);
        double side2 = distance(x1,y1,x3,y3);
        double side3 = distance(x2,y2,x3,y3);
        double s = (side1 + side2 + side3)/3;
        double area = Math.pow((s * (s-side1) * (s-side2) * (s-side3)) , 0.5);

        System.out.println("Side1 is " + side1);
        System.out.println("Side2 is " + side2);
        System.out.println("Side3 is " + side3);
        System.out.println("s is " + s);
        System.out.println("The area of the triangle is " + area);
    }

    public static double distance(double x1, double y1, double x2, double y2){
        double distance = Math.pow((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1), 0.5);
        return distance;
    }
}
