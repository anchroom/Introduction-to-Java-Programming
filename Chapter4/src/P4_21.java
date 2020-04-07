import java.util.Scanner;

public class P4_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN ");
        String insuranceNumber = input.nextLine();
        boolean status0 = ((insuranceNumber.charAt(0)) >= '0') && ((insuranceNumber.charAt(0)) <= '9');
        boolean status1 = ((insuranceNumber.charAt(1)) >= '0') && ((insuranceNumber.charAt(1)) <= '9');
        boolean status2 = ((insuranceNumber.charAt(2)) >= '0') && ((insuranceNumber.charAt(2)) <= '9');
        boolean status3 = ((insuranceNumber.charAt(3)) == '-') ;
        boolean status4 = ((insuranceNumber.charAt(4)) >= '0') && ((insuranceNumber.charAt(4)) <= '9');
        boolean status5 = ((insuranceNumber.charAt(5)) >= '0') && ((insuranceNumber.charAt(5)) <= '9');
        boolean status6 = ((insuranceNumber.charAt(6)) == '-');
        boolean status7 = ((insuranceNumber.charAt(7)) >= '0') && ((insuranceNumber.charAt(7)) <= '9');
        boolean status8 = ((insuranceNumber.charAt(8)) >= '0') && ((insuranceNumber.charAt(8)) <= '9');
        boolean status9 = ((insuranceNumber.charAt(9)) >= '0') && ((insuranceNumber.charAt(9)) <= '9');
        boolean status10 = ((insuranceNumber.charAt(10)) >= '0') && ((insuranceNumber.charAt(10)) <= '9');

        if (status0 && status1 && status2 && status3 && status4 && status5 && status6 && status7 && status8 && status9 && status10){
            System.out.println(insuranceNumber + " is a valid social security number");
        } else System.out.println(insuranceNumber + "is an invalid social security number");
    }
}
