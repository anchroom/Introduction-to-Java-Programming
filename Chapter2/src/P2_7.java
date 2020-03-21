import java.util.Scanner;

public class P2_7 {
    public static void main (String[] args){

        System.out.println("Enter the number of minutes:");

        Scanner input = new Scanner(System.in);
        long minutes = input.nextLong();

        int years;
        years = (int) minutes / (1440 * 365);
        int days;
        days = (int) minutes / 1440 % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
