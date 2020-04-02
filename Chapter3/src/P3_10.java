import java.util.Scanner;

public class P3_10 {
    public static void main(String[] args){
        int number1 = (int) (Math.random()*100);
        int number2 = (int) (Math.random()*100);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the result of " + number1 + " + " + number2);
        int result = input.nextInt();

        if ((number1+number2)==result){
            System.out.println("Super, you are right!");
        } else System.out.println("You make a mistake, the result is " + (number1 + number2));
    }
}
