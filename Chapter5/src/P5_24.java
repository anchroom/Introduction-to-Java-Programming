public class P5_24 {
    public static void main(String[] args){
        double sum = 0.0;
        for (int i = 0; i <= 48; i+=2){
            double current = ((double) i) / ((double) (i+2));
            sum += current;
        }
        System.out.println("Sum is " + sum);
    }
}
