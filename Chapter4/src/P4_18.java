import java.util.Scanner;

public class P4_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String inputCharacters = input.nextLine();

        String nameOfFach = "";
        switch (inputCharacters.charAt(0)){
            case 'M': nameOfFach = "Mathematics";break;
            case 'C': nameOfFach = "Computer";break;
            case 'I': nameOfFach = "Informatik";break;
            default:
                throw new IllegalStateException("Invalid input: " + inputCharacters);
        }

        String grade = "";
        switch (inputCharacters.charAt(1)){
            case '1': grade = "Freshman";break;
            case '2': grade = "Old freshman";break;
            case '3': grade = "Junior";break;
            case '4': grade = "Absolvent";break;
            default:
                throw new IllegalStateException("Invalid input: " + inputCharacters);
        }

        System.out.println(nameOfFach + " " + grade);
    }
}
