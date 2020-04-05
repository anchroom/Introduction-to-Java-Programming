import java.util.Scanner;

public class P4_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code (int from 0~127): ");
        char output = (char) input.nextInt();
        System.out.println("The character for ASCII code 69 is " + output);
    }
}
