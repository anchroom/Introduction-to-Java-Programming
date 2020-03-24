import java.util.Scanner;

public class P3_1 {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //
        System.out.println("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double watcher = Math.pow(b * b - 4 * a * c, 0.5);
        String output = null;
        if (watcher > 0) {
            double r_1 = (b * (-1) + watcher) / (2 * a);
            double r_2 = (b * (-1) - watcher) / (2 * a);
            output = "two roots " + r_1 + " and " + r_2;
        } else if (watcher == 0) {
            double r_1 = (b * (-1) + watcher) / (2 * a);
            output = "one root " + r_1;
        } else {
            output = "no real roots";
        }

        System.out.println("The equation has " + output);
    }
}
