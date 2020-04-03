import java.util.Scanner;

public class P3_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight of package: ");
        double weight = input.nextDouble();

        double kosten = 0.0;

        if(weight <= 1){
            kosten = 3.5;
        } else if (weight <= 3){
            kosten = 5.5;
        } else if (weight <= 10){
            kosten = 8.5;
        } else if (weight <= 20) {
            kosten = 10.5;
        } else System.out.print("The package cannot be shipped.");

        System.out.print("The kosten is " + kosten);
    }
}
