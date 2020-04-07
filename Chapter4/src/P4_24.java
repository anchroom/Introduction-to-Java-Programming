import java.util.Scanner;

public class P4_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String name1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String name2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String name3 = input.nextLine();

        int status1 = name1.compareTo(name2);
        int status2 = name2.compareTo(name3);
        int status3 = name3.compareTo(name1);
        System.out.println(status1 + status2 + status3);

        if((status1 > 0) && (status2 > 0) && (status3 < 0)){
            System.out.println("The three cities in alphabetical order are " + name1 + " " + name2 + " and " + name3);
        }
        if((status1 < 0) && (status2 > 0) && (status3 > 0)){
            System.out.println("The three cities in alphabetical order are " + name2 + " " + name3 + " and " + name1);
        }
        if((status1 > 0) && (status2 <0 ) && (status3 > 0)){
            System.out.println("The three cities in alphabetical order are " + name3 + " " + name1 + " and " + name2);
        }
        if((status1 > 0) && (status2 < 0) && (status3 < 0)){
            System.out.println("The three cities in alphabetical order are " + name1 + " " + name3 + " and " + name2);
        }
        if((status2 > 0) && (status3 > 0) && (status1 < 0)){
            System.out.println("The three cities in alphabetical order are " + name2 + " " + name1 + " and " + name3);
        }
        if((status2 < 0) && (status3 > 0) && (status1 < 0)){
            System.out.println("The three cities in alphabetical order are " + name3 + " " + name2 + " and " + name1);
        }

    }

}
