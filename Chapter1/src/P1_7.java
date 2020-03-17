// We divide two items in a group, and can solve it with for loop.

public class P1_7 {
    public static void main(String[] args){
        int i ;//variable for denominator
        double result = 0;// variable for result
        //make it into groups
        for (i=1; i<17; i+=4){
            result += ((1.0/i)-(1.0/(2*i+1.0)));
        }
        System.out.println(4*result);
    }
}
