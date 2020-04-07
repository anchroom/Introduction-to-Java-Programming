import java.util.Scanner;

public class P4_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o')
                || (letter == 'u') || (letter == 'A') || (letter == 'E') || (letter == 'I')
                || (letter == 'O') || (letter == 'U')){
            System.out.println("The letter is vowel");
        } else if (((letter <= 'Z') && (letter > 'A')) || ((letter <= 'z') && (letter > 'a'))){
            System.out.println("The letter is consonant");
        } else System.out.println(letter + " is an invalid input");
    }

}
