import java.util.Scanner;

public class P5_28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter the first weekday of the year: 0-6: ");
        int weekday = input.nextInt();

        int currentDay = weekday;
        final int MONTH_OF_YEAR = 12;
        for (int month = 1; month <= MONTH_OF_YEAR; month++){
            System.out.println(parseMonth(month) + " 1, " + year + " is " + parseWeekday(currentDay));
            currentDay += parseMonthDays(year, month);
            currentDay = currentDay % 7;
        }
    }

    // To parse the month into gap days
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

    // To recognize h
    private static String parseWeekday(int weekday){
        String weekdayInStr = "";
        switch (weekday){
            case 0: weekdayInStr = "Saturday";break;
            case 1: weekdayInStr = "Sunday";break;
            case 2: weekdayInStr = "Monday";break;
            case 3: weekdayInStr = "Tuesday";break;
            case 4: weekdayInStr = "Wednesday";break;
            case 5: weekdayInStr = "Thursday";break;
            case 6: weekdayInStr = "Friday";break;
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
