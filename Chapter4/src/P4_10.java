import java.util.Scanner;

public class P4_10 {
    public static void main(String[] args){
        int day = 0;
        final String ANSWER_YES = "yes";

        Scanner input = new Scanner(System.in);

        System.out.printf("Is your birthday in Set1?\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d" +
                "\nEnter \"yes\" and \"no\": ",1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31);
        String answer1 = input.nextLine();
        if (answer1.equals(ANSWER_YES))
            day += 1;

        System.out.printf("Is your birthday in Set2?\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d" +
                "\nEnter \"yes\" and \"no\": ",2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31);
        String answer2 = input.nextLine();
        if (answer2.equals(ANSWER_YES))
            day += 2;

        System.out.printf("Is your birthday in Set3?\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d" +
                "\nEnter \"yes\" and \"no\": ",4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31);
        String answer3 = input.nextLine();
        if (answer3.equals(ANSWER_YES))
            day += 4;

        System.out.printf("Is your birthday in Set4?\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d" +
                "\nEnter \"yes\" and \"no\": ",8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31);
        String answer4 = input.nextLine();
        if (answer4.equals(ANSWER_YES))
            day += 8;

        System.out.printf("Is your birthday in Set5?\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d\n%2d %2d %2d %2d" +
                "\nEnter \"yes\" and \"no\": ",16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31);
        String answer5 = input.nextLine();
        if (answer5.equals(ANSWER_YES))
            day += 16;

        System.out.println("\nYour birthday is " + day + "!" );
    }
}
