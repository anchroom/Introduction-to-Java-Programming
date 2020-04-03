import java.util.Scanner;

public class P3_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Number-1, Head-0\nEnter your guest; ");
        int coinSide = input.nextInt();
        String output;
        if( coinSide == (int)(Math.random() * 2)){
            output = "You are lucky!";
        } else output = "Buddy, you must buy a pig";

        System.out.print(output);

    }
}
