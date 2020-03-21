import java.util.Scanner;

public class P2_5 {
    public static void main(String[] args){
        double gratuity;
        double total;

        //input cue line
        System.out.println("Enter the subtotal and a gratuity rate:");
        //read input
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        //calculate
        gratuity = subtotal * rate / 100;
        total = subtotal + gratuity;

        //result output. be care of the format.
        System.out.printf("%s%.2f","The gratuity is " , gratuity);
        System.out.printf("%s%.2f%n"," and total is " , total);
    }
}
