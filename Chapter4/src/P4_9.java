import java.util.Scanner;

public class P4_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String character = input.nextLine();
        int number = (int) (character.charAt(0));
        System.out.println("The Unicode for the character " + character + " is: " + number);
    }
}
