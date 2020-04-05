import java.util.Scanner;

public class P4_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        double s = 2 * length * (Math.sin(Math.PI / 5));

        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5 ));

        System.out.printf("The area of the pentagonis %4.2f ." , area);
    }
}
