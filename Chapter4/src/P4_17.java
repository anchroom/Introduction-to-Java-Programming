import java.util.Scanner;

public class P4_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String monthInStr = input.next();


        System.out.println(monthInStr + " " + year + " has " + numberOfDayInMonat(monthInStr, year) + " days");
    }

    // to check if a year is a leapyear
    public static boolean leapYear(int year) {
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

    // to check the day in a monat
    public static int numberOfDayInMonat(String monatInStr, int year) {
        int numberOfDays;
        switch (monatInStr) {
            case "Jan":
                numberOfDays = 31;
                break;
            case "Feb":
                if (leapYear(year)) {
                    numberOfDays = 29;
                } else numberOfDays = 28;
                break;
            case "Mar":
                numberOfDays = 31;
                break;
            case "Apr":
                numberOfDays = 30;
                break;
            case "May":
                numberOfDays = 31;
                break;
            case "Jun":
                numberOfDays = 30;
                break;
            case "Jul":
                numberOfDays = 31;
                break;
            case "Aug":
                numberOfDays = 31;
                break;
            case "Sep":
                numberOfDays = 30;
                break;
            case "Oct":
                numberOfDays = 31;
                break;
            case "Nov":
                numberOfDays = 30;
                break;
            case "Dec":
                numberOfDays = 31;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + monatInStr);
        }
        return numberOfDays;
    }
}
