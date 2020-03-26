public class P2_19 {
    public static void main(String[] args){
        long a = System.currentTimeMillis();
        char randomLetter= (char) ((a % 26) + 60);
        System.out.println("The letter you get is " + randomLetter);
    }
}
