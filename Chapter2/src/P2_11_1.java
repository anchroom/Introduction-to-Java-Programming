import javax.swing.*;

public class P2_11_1 {
    public static void main(String[] args){
        // Create windows for getting information
        String inputName = JOptionPane.showInputDialog(null,"Enter the name of employer", "Information input window", JOptionPane.QUESTION_MESSAGE);
        String input_WOW = JOptionPane.showInputDialog(null,"Enter the worktime weekly in hour", "Information input window", JOptionPane.QUESTION_MESSAGE);
        String input_HP = JOptionPane.showInputDialog(null,"Enter the hourly pay", "Information input window", JOptionPane.QUESTION_MESSAGE);
        String input_USR = JOptionPane.showInputDialog(null,"Enter the United steuer rate in Int", "Information input window", JOptionPane.QUESTION_MESSAGE);
        String input_BSR = JOptionPane.showInputDialog(null,"Enter the steuer rate of State in Int", "Information input window", JOptionPane.QUESTION_MESSAGE);

        //transfer String into different form
        double hoursWorked = Double.parseDouble(input_WOW);
        double payRate = Double.parseDouble(input_HP);
        int federalWithholdingRate = Integer.parseInt(input_USR);
        int stateWithholdingRate = Integer.parseInt(input_BSR);

        //calculate
        double grossPay = payRate * hoursWorked;
        double deductions_FederalWithholdingRate = grossPay * federalWithholdingRate / 100;
        double deductions_StateWithholdingRate = grossPay * stateWithholdingRate / 100;
        double totalDeduction = deductions_FederalWithholdingRate+ deductions_StateWithholdingRate;
        double netPay = grossPay - totalDeduction;

        //display output information
        String output = "Employee Name: " + inputName +
                "\nHours worked: " + hoursWorked +
                "\nPay Rate:  $" + payRate +
                "\nGross Pay:  $" + grossPay +
                "\nDeductions:" +
                "\n  Federal Withholding (" + federalWithholdingRate + "%) :  $" + deductions_FederalWithholdingRate +
                "\n  State Withholding (" + stateWithholdingRate + "%) :  $" + deductions_StateWithholdingRate +
                "\n  Total Deduction:  $" + totalDeduction +
                "\nNet Pay:   $" + netPay;

        JOptionPane.showMessageDialog(null,output);
    }
}
