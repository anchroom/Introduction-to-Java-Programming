public class P5_11 {
    public static void main(String[] args){
        final int NUMBER_PER_LINE = 10;
        int count = 0;
        for(int n = 100; n<= 1000; n++){
            if(((n % 5 == 0) || (n % 6 == 0)) && (n % 30 != 0)){
                count++;
                if (count <= NUMBER_PER_LINE){
                    System.out.print(n + " ");
                } else {
                    count = 1;
                    System.out.print("\n" + n + " ");
                }
            }
        }

    }

}
