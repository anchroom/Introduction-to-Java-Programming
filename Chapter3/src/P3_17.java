import java.util.Scanner;

public class P3_17 {
    public static void main(String[] args){
        int computerGamer = (int) (Math.random() * 3);

        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int inputYou = input.nextInt();

        //Display result
        System.out.println("The computer is " + numberToName(computerGamer) + " . You are " + numberToName(inputYou) + judgeWhoWins(computerGamer, inputYou));

    }

    // To transfer number into names
    private static String numberToName (int number){
        String Name = "";
        switch (number){
            case 0: Name = "scissor";break;
            case 1: Name = "rock";break;
            case 2: Name = "paper";break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return Name;
    }

    // To judge who wins
    private  static String judgeWhoWins (int computerGamer, int inputYou){
        String resultOfGame = null ;
        if(computerGamer == inputYou){
            resultOfGame = " too. It is a draw";
        } else if ((inputYou - computerGamer == 1) || ((inputYou == 0) && (computerGamer == 2))){
            resultOfGame = ". You won";
        } else resultOfGame = ". You lose";
        return resultOfGame;
    }
}
