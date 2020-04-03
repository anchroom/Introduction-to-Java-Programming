import java.util.Scanner;

public class P3_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean result;

        if ((number % 5 == 0) && (number % 6 == 0)){
            result = true;
        } else result = false;
        System.out.println("Is " + number + " divisible by 5 and 6? " + result);

        if ((number % 5 == 0) || (number % 6 == 0)){
            result = true;
        } else result = false;
        System.out.println("Is " + number + " divisible by 5 or 6? " + result);

        if (((number % 5 == 0) || (number % 6 == 0)) && (number % 30 != 0)){
            result = true;
        } else result = false;
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + result);

    }
}
