public class P5_27 {

    public static void main(String[] args){
        int count = 0;
        for (int jahr = 101; jahr <= 2100; jahr++){
            if (leapYear(jahr)){
                count++;
                if (count < 10){
                    System.out.print(jahr + " ");
                } else if (count == 10){
                    System.out.println(jahr);
                    count = 0;
                }
            } else continue;
        }

    }

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
