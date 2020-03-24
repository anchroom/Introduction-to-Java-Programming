# 选择


---
从本章起，参照第10版，而非前两章的第8版。
---
## 1.关于两个浮点数值的相等测试
```java
// 下面的代码执行不了，因为这里的x并不是精确等于0.5，而是0.50000000000000001
double x = 1.0 - 0.1- 0.1- 0.1- 0.1- 0.1; 
System•out•println(x » 0.S);
```
因此，两个浮点数值不能通过相等测试，但可以**通过两个数的差距小于一个阈值**，如下：
```java
final double EPSILON = 1E-14;
double x = 1.0- 0.1- 0.1- 0.1- 0.1- 0.1;
if (Math.abs(x-0.5) < EPSILON)
    System.out.println(x + "is approximately 0.5");
```

## 2.产生随机数
```java
Math.random()产生一个随机的0-1间的数字
//要得到一个0-10间的随机整数
int number = (int) (Math.random()*10);
```

## 3.幂运算
```java
//平方根运算
Math.pow(number,0.5);
```

## 复习题

### 3.3
```java
code example in test file
```
两个方向的直接强制类型转换都是不行的！！！
```java
//boolean to int
public class Demo {
   public static void main(String[] args) {
      // boolean
      boolean bool = true;
      System.out.println("Boolean Value: "+bool);
      //这是最常见的boolean 转int 的方式
      int val = (bool) ? 1 : 0;
      // Integer
      System.out.println("Integer value: "+val);
   }
}



//int to boolean
public class Demo {
   public static void main(String[] args) {
      int val = 100;
      System.out.println("Integer: "+val);
      boolean bool = (val == 100);
      System.out.println("Converted to Bool: "+bool);
   }
```