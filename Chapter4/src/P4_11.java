import java.util.Scanner;

public class P4_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int valueOfdecimal = input.nextInt();

        char valueOfhex;
        if (valueOfdecimal <10){
            valueOfhex = (char) valueOfdecimal;
        } else {
            valueOfhex = (char) ('A' + (valueOfdecimal - 10));
        }

        System.out.println("The hex value is " + valueOfhex);
    }
}
