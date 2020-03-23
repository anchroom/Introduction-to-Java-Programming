##基本程序设计


1.从控制台读取输入

```java
insert java.util.Scanner;

Scanner input = new Scanner (System.in);
```

2.Java内的运算优先级

    计算最内层括号》乘法、除法和求余，多重的话从左至右执行》加法和减法

3.String 不是一个基本类型，而是一个reference type

4.输入输出显示框
```java
//把所有输入先都读成String
String input = JOptionPane.showInputDialog(null, "Enter a input", "Input Dialog Demo", JOptionPane.QUESTION_MESSAGE);
//然后运用对应数据类型的转换方法
//如int，如字符串为123,则轮换为123
int intValue = Integer.parseInt(intString);
//如 double,如字符串
double doubleValue = Double.parseDouble(doubleString);

//输出通过语句
String output = "The result you want to display";
JOptionPane.showMessageDialog(null, output);
```

