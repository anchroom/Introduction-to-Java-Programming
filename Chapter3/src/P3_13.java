import java.util.Scanner;

public class P3_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er),\n 2-married separately, 3-head of" + "household)\nEnter the filing status: ");

        int status = input.nextInt();

        //Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = income * taxRate(status, income) ;

        System.out.print("Tax is " + tax);

    }

    // For tax computing
    // We define six different rates in 1-6, and
    private static double taxRate (int status, double income){
        double rate = 0;
        switch (status){
            case 0:
                if (income <= 8350){
                    rate = 0.1;
                } else if (income <= 33950){
                    rate = 0.15;
                } else if (income <= 52250){
                    rate = 0.25;
                } else if (income <= 171550){
                    rate = 0.28;
                } else if (income <= 372950){
                    rate = 0.33;
                } else rate = 0.35;
                break;

            case 1:
                if (income <= 16700){
                    rate = 0.1;
                } else if (income <= 67900){
                    rate = 0.15;
                } else if (income <= 137050){
                    rate = 0.25;
                } else if (income <= 208850){
                    rate = 0.28;
                } else if (income <= 372950){
                    rate = 0.33;
                } else rate = 0.35;
                break;

            case 2:
                if (income <= 8350){
                    rate = 0.1;
                } else if (income <= 33950){
                    rate = 0.15;
                } else if (income <= 68525){
                    rate = 0.25;
                } else if (income <= 104425){
                    rate = 0.28;
                } else if (income <= 186475){
                    rate = 0.33;
                } else rate = 0.35;
                break;

            case 3:
                if (income <= 11950){
                    rate = 0.1;
                } else if (income <= 45500){
                    rate = 0.15;
                } else if (income <= 117450){
                    rate = 0.25;
                } else if (income <= 190200){
                    rate = 0.28;
                } else if (income <= 372950){
                    rate = 0.33;
                } else rate = 0.35;
                break;
        }
        return rate;
    }
}
