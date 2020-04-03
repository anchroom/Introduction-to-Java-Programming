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

## 4.Java变量的初始化和赋值
其它都可以在初始化时不赋值，但String 不行，虽然会指向null，但作为一个对象，没有初始值会容易出问题。

Java语言里，new表达式总体负责两个动作：一是分配对象空间并对其做默认初始化。默认初始化会将对象的所有成员字段设到其类型对应的默认值（零值）。
二是初始化对象。其中构造器只负责第2点，第1点是包含在new表达式里的语义。

```java
package variable.initialize;
public class Test {
    int intAge;
    short shortAge;
    long longAge;
    float floatAge;
    double doubleAge;
    char charC;
    boolean booleanFlg;
    byte byteB;
    String string;

    private void print() {
        System.out.println("The default value for int is " + intAge);
        System.out.println("The default value for short is " + shortAge);
        System.out.println("The default value for long is " + longAge);
        System.out.println("The default value for float is " + floatAge);
        System.out.println("The default value for double is " + doubleAge);
        System.out.println("The default value for char is " + charC+((int)charC));
        System.out.println("The default value for boolean is " + booleanFlg);
        System.out.println("The default value for bayte is " + byteB);
        System.out.println("The default value for String is " + string);

    }

    public static void main(String[] args) {
        new Test().print();
    }
}


// result output
The default value for int is 0
The default value for short is 0
The default value for long is 0
The default value for float is 0.0
The default value for double is 0.0
The default value for char is 
The default value for boolean is false
The default value for bayte is 0
The default value for String is null
```

Java 先初始化静态比变量和静态块，然后在初始化非静态变量和块，这些都在构造方法调用前调用。如果多个相同类型（此处指的是静态和非静态）的变量或块，则按照顺序来初始化。
                                               对于静态的只在class第一次加载的时候初始化，并且初始化一次
```java
package variable.initialize;

class Dog {
    int age;

    Dog(int age) {
        this.age = age;
        System.out.println("This is the constructor of Dog class, with age " + age);
    }

}

public class Test2 {
    Dog dog1 = new Dog(2);
    {
        System.out.println("I am a nomal block.");
    }
    static Dog dog2 = new Dog(3);
    static{
        System.out.println("I am a static block.");
    }

    private Test2() {
        System.out.println("This is the constructor of Test class.");
    }

    public static void main(String[] args) {
        new Test2();
    }
}


//output
This is the constructor of Dog class, with age 3
I am a static block.
This is the constructor of Dog class, with age 2
I am a nomal block.
This is the constructor of Test class.
```
所有变量都必须初始化，只不过有的不用直接赋值，会赋默认值，所以从外面看起来，全局变量不一定赋值，局部变量必须赋值；
```java
public class Demo {
    int m;
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.m); //输出0
    }
}

public class Demo {
    public static void main(String[] args) {
        int m;
        System.out.println(m); //报未初始化错误
    }
}
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