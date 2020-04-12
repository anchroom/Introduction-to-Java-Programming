import java.util.Scanner;

public class P5_16 {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        System.out.println("enter a integer: ");
        int number = input.nextInt();

        int result = 2;
        int remainingNumber = number;
            //
        while (remainingNumber != result){
            if ((remainingNumber % result) != 0) {
                result++;
            } else {
                System.out.print("" + result + ", ");
                remainingNumber = remainingNumber / result;
            }
        }
        System.out.print("" + result);
    }
}
