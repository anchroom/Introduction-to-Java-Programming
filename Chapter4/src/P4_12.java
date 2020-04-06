import java.util.Scanner;

public class P4_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexValue = input.nextLine();
        byte binaryValue;

        if((((int)(hexValue.charAt(0)) < 71) && (((int)(hexValue.charAt(0))) > 64))){
            binaryValue = (byte)(((int)(hexValue.charAt(0))) - 55);
            System.out.println("The binary value is " + (Integer.toBinaryString(binaryValue)));
        } else if ((((int)(hexValue.charAt(0))) < 58) && (((int)(hexValue.charAt(0)) > 47))){
            binaryValue = (byte) (Integer.parseInt(hexValue));
            System.out.println("The binary value is " + (Integer.toBinaryString(binaryValue)));
        } else System.out.println(hexValue + " is an invalid input.");
    }
}
