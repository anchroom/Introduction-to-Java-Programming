import java.util.Scanner;

public class P5_29 {
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of year: ");
        int year = input.nextInt();
        System.out.print("Enter the number of weekday of the first day in the year: ");
        int weekday = input.nextInt();

        final int MONTH_OF_YEAR = 12;
        int currentDay = weekday;
        for (int month = 1; month <= MONTH_OF_YEAR; month++){
            System.out.printf("%25s %-4d\n", parseMonth(month), year);
            System.out.println("——————————————————————————————————————————————");
            System.out.printf("%4s    %3s    %3s    %3s    %3s    %3s    %3s\n\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            // display week in line
            int calenderNumbers = 1;
            for(int week = 1; week <= 6; week ++) {
                // To display a line
                for (int outputInWeekday = (7 * (week - 1)); outputInWeekday <= (6 + (7 * (week - 1))); outputInWeekday++){
                    if(outputInWeekday < currentDay){
                        System.out.print("       ");
                    } else {
                        System.out.printf("%3d    ", calenderNumbers);
                        calenderNumbers++;
                    }
                    if (calenderNumbers > parseMonthDays(year, month))break;
                }
                System.out.println("\n");
                if (calenderNumbers > parseMonthDays(year, month))break;
            }
            currentDay = (currentDay + parseMonthDays(year, month)) % 7;
        }
    }

    private static String parseWeekday(int weekday){
        String weekdayInStr = "";
        switch (weekday){
            case 0: weekdayInStr = "Sun";break;
            case 1: weekdayInStr = "Mon";break;
            case 2: weekdayInStr = "Tue";break;
            case 3: weekdayInStr = "Wed";break;
            case 4: weekdayInStr = "Thu";break;
            case 5: weekdayInStr = "Fri";break;
            case 6: weekdayInStr = "Sat";break;
            default:
                throw new IllegalStateException("Unexpected value: " + weekday);
        }
        return weekdayInStr;
    }

    // To recognize month
    private static String parseMonth(int month){
        String monthInStr = "";
        switch (month){
            case 1: monthInStr = "January";break;
            case 2: monthInStr = "February";break;
            case 3: monthInStr = "March";break;
            case 4: monthInStr = "April";break;
            case 5: monthInStr = "May";break;
            case 6: monthInStr = "Juni";break;
            case 7: monthInStr = "July";break;
            case 8: monthInStr = "August";break;
            case 9: monthInStr = "September";break;
            case 10: monthInStr = "October";break;
            case 11: monthInStr = "November";break;
            case 12: monthInStr = "December";break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        return monthInStr;
    }

    private static int parseMonthDays(int year, int month){
        int numberOfDays = 0;
        switch (month){
            case 1: numberOfDays = 31;break;
            case 2:
                if (leapYear(year)){
                    numberOfDays = 29;
                } else numberOfDays = 28;
                break;
            case 3: numberOfDays = 31;break;
            case 4: numberOfDays = 30;break;
            case 5: numberOfDays = 31;break;
            case 6: numberOfDays = 30;break;
            case 7: numberOfDays = 31;break;
            case 8: numberOfDays = 31;break;
            case 9: numberOfDays = 30;break;
            case 10: numberOfDays = 31;break;
            case 11: numberOfDays = 30;break;
            case 12: numberOfDays = 31;break;
        }
        return numberOfDays;
    }


    // To check if is a leap year
    private static boolean leapYear(int year) {
        boolean statusOfLeapyear;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                statusOfLeapyear = true;
            } else statusOfLeapyear = false;
        } else {
            if (year % 4 == 0) {
                statusOfLeapyear = true;
            } else statusOfLeapyear = false;
        }
        return statusOfLeapyear;
    }
}
