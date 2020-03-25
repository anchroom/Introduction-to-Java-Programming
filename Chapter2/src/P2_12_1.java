import javax.swing.*;

public class P2_12_1 {
    public static void main(String[] args){
        //Create windows
        String input = JOptionPane.showInputDialog(null,"Enter balance and interest rate (e.g., 3 for 3%):", "interest calculate", JOptionPane.QUESTION_MESSAGE);

        //Form change
        //！！！这是一个难点，在同一个字符串中得到两个格式不同的数值
        String[] splited = input.split("\\s+");//正则表达式，通过空格分隔成两个字符串
        double balance = Double.parseDouble(splited[0]);
        double rate = Double.parseDouble(splited[1]);

        //calculate
        double interest = balance * (rate/1200);

        //display result
        String output = "The interest is " + interest;
        JOptionPane.showMessageDialog(null,output);

    }
}
