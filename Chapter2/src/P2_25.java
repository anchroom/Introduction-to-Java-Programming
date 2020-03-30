import java.util.Scanner;

public class P2_25 {
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT; ");
        int timeZone = input.nextInt();
        String output = "";

        if ((currentHour + timeZone)< 24){
            output = "is " + (currentHour + timeZone) + ":" + currentMinute + ":" + currentSecond;
        } else {
            output = "is " + (currentHour + timeZone - 24) + ":" + currentMinute + ":" + currentSecond;
        }
        System.out.println("The current time "+ output);
    }
}
