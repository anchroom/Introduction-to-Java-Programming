public class W3_3 {
    public static void main(String[] args){
        boolean a = true;
        int h = (a)? 1 : 0;

        int i = 1;
        boolean b =  (i == 1);

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
