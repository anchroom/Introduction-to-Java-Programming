import javafx.scene.input.PickResult;

import java.util.Scanner;

public class P2_2 {
    public static void main(String[] args){
        double area;
        double volume;
        final double PI = 3.14159;

        //input cue line
        System.out.println("Enter the radius and length of a cylinder:");
        //read input
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double cylinder = input.nextDouble();

        //calculate
        area = radius * radius * PI;
        volume = area * cylinder;

        //result output.
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }


}
