import java.util.Scanner;

public class P4_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String inputString = input.nextLine();

        int length = inputString.length();
        char firstLetter = inputString.charAt(0);

        System.out.println("Length of String is " + length + " and the first letter is " + firstLetter);
    }
}
