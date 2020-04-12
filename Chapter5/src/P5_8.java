import java.util.Scanner;

public class P5_8 {
    public static void main(String[] args){
        // Create Scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scan.nextInt();

        String nameOfBest = "";
        int bestNote = 0;
        for (int i = 0; i < numberOfStudents; i++){
            System.out.println("Enter the name of Student: ");
            String name = scan.next();

            System.out.println("and the note: ");
            int note = scan.nextInt();

            if (note > bestNote){
                bestNote = note;
                nameOfBest = name;
            }
        }

        System.out.println("The best student is: " + nameOfBest);
    }
}
