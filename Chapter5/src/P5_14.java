import java.util.Scanner;

public class P5_14 {
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int result = 0;

        for(int d = Math.min(n1, n2); d >= 1; d--){
            if(((n1 % d) == 0) && ((n2%d) == 0)){
                result=d;
                break;
            }
        }
        System.out.println("The result is: " + result);


    }

}
