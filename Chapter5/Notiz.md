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


## 