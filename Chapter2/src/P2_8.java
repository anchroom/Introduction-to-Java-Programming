import java.util.Scanner;

public class P2_8 {
    public static void main(String[] args){

        System.out.println("Enter an ASCII code:");

        Scanner input = new Scanner(System.in);
        int code = input.nextInt();

        char character;
        character = (char) code;

        System.out.println("The character for ASCII " + character);
    }
}
