import java.util.Scanner;

public class P5_9 {
    public static void main(String[] args){
        // Create Scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scan.nextInt();

        String nameOfBest = "";
        int bestNote = 0;
        String nameOfSecond = "";
        int secondNote = 0;
        for (int i = 0; i < numberOfStudents; i++){
            System.out.println("Enter the name of Student ");
            String name = scan.next();
            System.out.println("and the note: ");
            int note = scan.nextInt();

            if (note > bestNote){
                secondNote = bestNote;
                nameOfSecond = nameOfBest;
                bestNote = note;
                nameOfBest = name;
            } else if (note > secondNote){
                secondNote = note;
                nameOfSecond = name;
            }
        }

        System.out.println("The best student is: " + nameOfBest + " and the score is:  " + bestNote +
                ";\n and the second is: " + nameOfSecond + " and the score is: " + secondNote);

    }
}
