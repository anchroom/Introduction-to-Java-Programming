import java.util.Scanner;

public class P4_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        // compute the coordinates
        double x1 = radius * Math.sin(Math.toRadians(72 * 1));
        double y1 = radius * Math.cos(Math.toRadians(72 * 1));
        double x2 = radius * Math.sin(Math.toRadians(0));
        double y2 = radius * Math.cos(Math.toRadians(0));
        double x3 = radius * Math.sin(Math.toRadians(72 * 4));
        double y3 = radius * Math.cos(Math.toRadians(72 * 4));
        double x4 = radius * Math.sin(Math.toRadians(72 * 3));
        double y4 = radius * Math.cos(Math.toRadians(72 * 3));
        double x5 = radius * Math.sin(Math.toRadians(72 * 2));
        double y5 = radius * Math.cos(Math.toRadians(72 * 2));

        System.out.printf("(%4.4f, %4.4f)\n(%4.4f, %4.4f)\n(%4.4f, %4.4f)\n(%4.4f, %4.4f)\n(%4.4f, %4.4f)", x1, y1, x2, y2, x3, y3, x4, y4, x5, y5);

    }


}
