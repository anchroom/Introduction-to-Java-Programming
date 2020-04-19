import java.util.Scanner;

public class P5_34 {
    public static void main(String[] args){
        // generate input of computer
        Scanner input = new Scanner(System.in);

        int inputOfComputer;
        int inputOfGamer;
        do {
            inputOfComputer = (int)(Math.random() * 3 + 1);

            System.out.println("1-stone\t2-scissor\t3-paper\nEnter a number: ");
            inputOfGamer = input.nextInt();

            System.out.println("Computer is " + parseNumberToString(inputOfComputer) + "; You are " + parseNumberToString(inputOfGamer)
                    + ". " + judger(inputOfComputer, inputOfGamer) + ".\n");
        } while ((judger(inputOfComputer, inputOfGamer).equals("Draw")));
    }

    // To parse the number to gameString
    private static String parseNumberToString (int number){
        String output = "Null";
        switch (number){
            case 1: output = "stone";break;
            case 2: output = "scissor";break;
            case 3: output = "paper";break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return output;
    }

    // To judge who is winner
    private static String judger(int inputOfComputer, int inputOfGamer){
        String result;
        if (inputOfComputer == inputOfGamer){
            result = "Draw";
        } else if (((inputOfComputer == (inputOfGamer - 1)) && (inputOfComputer <= 2))
                || ((inputOfComputer == 3) && (inputOfGamer == 2))){
            result = "Lose";
        } else result = "Win";
        return result;
    }
}
