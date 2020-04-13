# 循环

## 最小化数值错误

涉及浮点数的数值误差是不可避免的，因为浮点数在计算机中本身就是近似表示的。接下来我们通过从0。01...一直加到1.0来进行说明。
假如按照习惯直接编程
```java
public class TestSum{
    public static void main(String[] args){
        float sum = 0;
        for(float i = 0.01f; i <= 1.0; i = i + 0.01f)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}


//output: The sum is 50.499985.
```

所以我们可以得出，循环内的控制变量我们尽量不用float。假如必须的话，用double 精度用更高一些。但用double 之后，同样的代码会发现，最后一次i比1大一点，所以循环终止了。
为了解决这个问题，我们还是使用**整形计数器**。


但从上向下，和从下向上也有区别：

```java
//从下向上
double currentValue = 0.01;

for(int count = 0; count < 100; count++){
    sum += currentValue;
    currentValue += 0.01;
}
//output: 50.50000000000003

//从上向上
double currentValue = 1.0;

for(int count = 0; count < 100; count++){
    sum += currentValue;
    currentValue -= 0.01;
}
//output: 50.49999999999995
```

从大到小没有从小到大得到的值精确，因为一个很大的值加一个很小的值，对结果的变化是可以省略的，因此这点也需要注意。


## P5-17 打印一个对称的数阵
```java
public class P5_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for(int currentLine = 1; currentLine <= numberOfLines; currentLine++){
            System.out.println( outputOfBlanks(numberOfLines, currentLine) + outputOfLeftNumbers(currentLine) + "1" + outputOfRightNumbers(currentLine));
        }


    }

    // To print blanks
    // The number of blanks is 3*(numberOfLines - 1)
    private static String outputOfBlanks (int numberOfLines, int currentLine){
        String outputOfBlanks = "";
        for (int i = numberOfLines - currentLine; i > 0; i-- ){
            System.out.print("   ");
        }
        return outputOfBlanks;
    }

    // To print the left part of numbers before 1
    private static String outputOfLeftNumbers (int currentLine){
        String outputOfLeftNumbers = "";
        for(int i = currentLine; i >= 2; i--){
            System.out.print(i + "  ");
        }
        return outputOfLeftNumbers;
    }

    // To print 1
    private static String outputOfOnes{
        System.out.print("1");
    }

    // To print the right part of numbers after 1
    private static String outputOfRightNumbers (int currentLine){
        String outputOfRightNumbers = "";
        for(int i = 2; i <= currentLine; i++){
            System.out.print("  " + i);
        }
        return outputOfRightNumbers;
    }
}


这里最大的问题是输出的时候输出单个的1会叠加到末尾
这里的问题是： 为什么System.out.println( outputOfBlanks(numberOfLines, currentLine) + outputOfLeftNumbers(currentLine) + "1" + outputOfRightNumbers(currentLine));的输出结果1在末尾
经测试和输出函数有一定关系，换成outputOfOnes 结果效果就一致，但将里面的for循环去掉，直接赋值字符串，仍然不行
```