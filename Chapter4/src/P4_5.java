import java.util.Scanner;

public class P4_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = (numberOfSides * s * s) / (4 * Math.tan(Math.PI / numberOfSides ));

        System.out.printf("The area of the polygon %4.14f ." , area);
    }
}

