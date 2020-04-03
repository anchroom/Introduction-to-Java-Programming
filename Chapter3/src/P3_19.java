import java.util.Scanner;

public class P3_19 {
    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of three sides: ");
        double length1 = input.nextDouble();
        double length2 = input.nextDouble();
        double length3 = input.nextDouble();

        double perimeter = length1 + length2 + length3;

        if ((length1 >= (perimeter / 2)) || (length2 >= (perimeter / 2)) || (length3 >= (perimeter / 2))){
            System.out.println("What you enter is not a triangle.");
        } else System.out.println("The perimeter is " + perimeter);
    }
}
