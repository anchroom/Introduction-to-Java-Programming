public class P5_35 {
    public static void main(String[] args){
        double sum = 0.0;

        for (int i = 624; i >= 1; i--){
            sum += (1.0 / (Math.sqrt((double) i) + Math.sqrt((double) (i + 1))));
        }
        System.out.println(sum);
    }
}
