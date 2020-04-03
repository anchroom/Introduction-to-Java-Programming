import java.util.Scanner;

public class P3_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12; ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();

        int m;
        if ((month == 1) || (month == 2)){
            m = month + 12;
            year = year - 1;
        } else {
            m = month;
        }

        int j = year / 100;
        int k = year % 100;

        int h = (q + (26 * (m + 1))/10 + k + k/4 + j/4 + 5*j) % 7;

        System.out.println("Day of the week is " + parseWeekdayToH(h));
    }

    // To recognize h
    private static String parseWeekdayToH(int h){
        String weekday = "";
        switch (h){
            case 0: weekday = "Saturday";break;
            case 1: weekday = "Sunday";break;
            case 2: weekday = "Monday";break;
            case 3: weekday = "Tuesday";break;
            case 4: weekday = "Wednesday";break;
            case 5: weekday = "Thursday";break;
            case 6: weekday = "Friday";break;
            default:
                throw new IllegalStateException("Unexpected value: " + h);
        }
        return weekday;
    }

}
