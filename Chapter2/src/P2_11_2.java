import java.util.Scanner;

public class P2_11_2 {
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name:");
        String inputName = input.nextLine();
        System.out.print("Enter the worktime weekly in hour:");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter the hourly pay:");
        double payRate = input.nextDouble();
        System.out.print("Enter the United steuer rate:");
        double federalWithholdingRate = input.nextDouble();
        System.out.print("Enter the steuer rate of State:");
        double stateWithholdingRate = input.nextDouble();

        //calculate
        double grossPay = payRate * hoursWorked;
        double deductions_FederalWithholdingRate = grossPay * federalWithholdingRate;
        double deductions_StateWithholdingRate = grossPay * stateWithholdingRate;
        double totalDeduction = deductions_FederalWithholdingRate+ deductions_StateWithholdingRate;
        double netPay = grossPay - totalDeduction;

        //display output information
        System.out.print("Employee Name: " + inputName +
                "\nHours worked: " + hoursWorked +
                "\nPay Rate:  $" + payRate +
                "\nGross Pay:  $" + grossPay +
                "\nDeductions:" +
                "\n  Federal Withholding (" + federalWithholdingRate * 100 + "%) :  $" + deductions_FederalWithholdingRate +
                "\n  State Withholding (" + stateWithholdingRate * 100 + "%) :  $" + deductions_StateWithholdingRate +
                "\n  Total Deduction:  $" + totalDeduction +
                "\nNet Pay:   $" + netPay);
    }
}
