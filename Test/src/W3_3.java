public class W3_3 {
    public static void main(String[] args){
        boolean a = true;
        int h = (int) a;

        int i = 1;
        boolean b = (boolean) i;

        if(h == 1){
            System.out.println("The first one is right.");
        } else {
            System.out.println("The first one is wrong.");
        }

        if(b){
            System.out.println("The second one is right.");
        } else {
            System.out.println("The second one is wrong.");
        }

    }
}
