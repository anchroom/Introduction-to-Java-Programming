import static java.lang.Math.*;

import java.io.PrintStream;
import java.util.Formatter.*;

public class P2_18 {

    public static void main(String[] args){


        for (int i=1; i<6; i++){
            double a = i;
            double b = a + 1;
            double c = pow(a,b);
            System.out.format("%-15l%-15l%-15l", a, b, c);
        }
    }
}
