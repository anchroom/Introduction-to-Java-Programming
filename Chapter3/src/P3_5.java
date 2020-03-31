import java.util.Scanner;

public class P3_5 {

    public static void main(String[] args){
        //Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day(0-6): ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDaysNumber = input.nextInt();

        //future day calculate
        int futureDay;
        if((today+elapsedDaysNumber)<7){
            futureDay = today + elapsedDaysNumber;
        } else {
            futureDay = (today + elapsedDaysNumber) % 7;
        }

        String outputToday = P3_5.weekday(today);
        String outputFutureDay = P3_5.weekday(futureDay);


        System.out.println("Today is " + outputToday + " and the future day is " + outputFutureDay);
    }

    //to tell which day is the number
    public static String weekday(int day) {
        String output;
        switch (day) {
            case 0:
                output = "Monday";
                break;
            case 1:
                output = "Tuesday";
                break;
            case 2:
                output = "Wednesday";
                break;
            case 3:
                output = "Thursday";
                break;
            case 4:
                output = "Friday";
                break;
            case 5:
                output = "Saturday";
                break;
            case 6:
                output = "Sonday";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
        return output;
    }
}
