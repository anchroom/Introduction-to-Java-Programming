public class P5_15 {
    public static void main(String[] args){
        final int NUMBER_PER_LINE = 10;
        int count = 0;

        for (int i = 33; i<= 126; i++){
            count++;
            if(count < 11){
                System.out.print("" + (char) i);
            } else {
                count = 1;
                System.out.print("\n" + (char) i);
            }

        }
    }
}
