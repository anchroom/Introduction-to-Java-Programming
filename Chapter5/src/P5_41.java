import java.util.Scanner;

public class P5_41 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers and ends with 0: ");
        int number = input.nextInt();

        int max = number;
        int count = 1;
        if (number == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            // keep reading number until the input is 0
            do {
                number = input.nextInt();
                if (number > max){
                    max = number;
                    count = 1;
                } else if (number == max){
                    count++;
                }
            } while (number != 0);
        }
        System.out.println("The largest number is " + max + "\nThe occurrence count of the largest number is " + count);
    }
}
