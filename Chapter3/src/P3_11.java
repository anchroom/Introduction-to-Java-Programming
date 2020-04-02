import java.util.Scanner;

public class P3_11 {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of monat and year: ");
        int monat = input.nextInt();
        int year = input.nextInt();

        System.out.println(monatNumberToName(monat) + " " + year + " has " + numberOfDayInMonat(monat, year) + " days.");
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
    public static int numberOfDayInMonat(int monat, int year) {
        int numberOfDays;
        switch (monat) {
            case 1:
                numberOfDays = 31;
                break;
            case 2:
                if (leapYear(year)) {
                    numberOfDays = 29;
                } else numberOfDays = 28;
                break;
            case 3:
                numberOfDays = 31;
                break;
            case 4:
                numberOfDays = 30;
                break;
            case 5:
                numberOfDays = 31;
                break;
            case 6:
                numberOfDays = 30;
                break;
            case 7:
                numberOfDays = 31;
                break;
            case 8:
                numberOfDays = 31;
                break;
            case 9:
                numberOfDays = 30;
                break;
            case 10:
                numberOfDays = 31;
                break;
            case 11:
                numberOfDays = 30;
                break;
            case 12:
                numberOfDays = 31;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + monat);
        }
        return numberOfDays;
    }

    // to change the number of monat to name
    public static String monatNumberToName(int monat) {
        String monatName;
        switch (monat) {
            case 1:
                monatName = "January";
                break;
            case 2:
                monatName = "February";
                break;
            case 3:
                monatName = "March";
                break;
            case 4:
                monatName = "April";
                break;
            case 5:
                monatName = "May";
                break;
            case 6:
                monatName = "Juni";
                break;
            case 7:
                monatName = "July";
                break;
            case 8:
                monatName = "August";
                break;
            case 9:
                monatName = "September";
                break;
            case 10:
                monatName = "October";
                break;
            case 11:
                monatName = "November";
                break;
            case 12:
                monatName = "December";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + monat);
        }
        return monatName;
    }
}
