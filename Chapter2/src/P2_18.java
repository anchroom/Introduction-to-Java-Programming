import static java.lang.Math.*;



public class P2_18 {

    public static void main(String[] args){
        for (int a=1; a<6; a++) System.out.format("%-15s %-15s %-15s%n", a, a+1, pow(a,a+1));
    }
}
