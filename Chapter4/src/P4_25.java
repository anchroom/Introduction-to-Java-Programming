public class P4_25 {
    public static void main(String[] args){
        char letter1 = (char)(Math.random()*26 + 'A');
        char letter2 = (char)(Math.random()*26 + 'A');
        char letter3 = (char)(Math.random()*26 + 'A');
        int number = (int)(Math.random()*10000);

        System.out.println("The number of the car is " + letter1 + letter2 + letter3 + number);
    }
}
