import java.util.Scanner;

public class P5_32 {
    public static void main(String[] args){
        int digit1 = (int)(Math.random() * 10);
        int digit2;
        do {
            digit2 = (int)(Math.random() * 10);
        } while (digit1 == digit2);

        System.out.println("The two digits numberis: " + (digit1 * 10 + digit2));
    }
}
