import java.util.Scanner;

public class P2_20 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.printf("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.pow((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1), 0.5);

        System.out.printf("The distance of the two points is " + distance);
    }
}
