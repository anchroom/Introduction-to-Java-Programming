import java.util.Scanner;

public class P4_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char letterGrade = input.next().charAt(0);

        int numberOfLetterGrade = 0;
        switch(letterGrade){
            case 'A': numberOfLetterGrade = 4;break;
            case 'B': numberOfLetterGrade = 3;break;
            case 'C': numberOfLetterGrade = 2;break;
            case 'D': numberOfLetterGrade = 1;break;
            case 'F': numberOfLetterGrade = 0;break;
            default:
                throw new IllegalStateException("Unexpected value: " + letterGrade);
        }
        System.out.println("The numeric value for grade " + letterGrade + " is " + numberOfLetterGrade);
    }
}
