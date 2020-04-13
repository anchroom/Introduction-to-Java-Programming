import java.util.Scanner;

public class P5_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for(int currentLine = 1; currentLine <= numberOfLines; currentLine++){
            System.out.println( outputOfBlanks(numberOfLines, currentLine) + outputOfLeftNumbers(currentLine) + outputOfRightNumbers(currentLine));
        }


    }

    // To print blanks
    // The number of blanks is 3*(numberOfLines - 1)
    private static String outputOfBlanks (int numberOfLines, int currentLine){
        String outputOfBlanks = "";
        for (int i = numberOfLines - currentLine; i > 0; i-- ){
            System.out.print("   ");
        }
        return outputOfBlanks;
    }
/*
    // To print the left part of numbers before 1
    // when we use for loop, it works as respected, but
    private static String outputOfLeftNumbers (int currentLine){
        String outputOfLeftNumbers = "";
        for(int i = currentLine; i >= 1; i--){
            System.out.print(i + "  ");
        }
        return outputOfLeftNumbers;
    }*/

    // To print the left part of numbers before 1
    private static String outputOfLeftNumbers (int currentLine){
        String outputOfLeftNumbers = "";
        for(int i = currentLine; i >= 1; i--){
            System.out.print(i + "  ");
        }
        return outputOfLeftNumbers;
    }

    // To print the right part of numbers after 1
    private static String outputOfRightNumbers (int currentLine){
        String outputOfRightNumbers = "";
        for(int i = 2; i <= currentLine; i++){
            System.out.print( i + "  ");
        }
        return outputOfRightNumbers;
    }
}
