public class P5_13 {
    public static void main(String[] args){
        int n = 1;
        do {
            n++;
        } while ((n*n*n) <12000);
        System.out.println("The largest number is: " + (n-1));
    }
}
