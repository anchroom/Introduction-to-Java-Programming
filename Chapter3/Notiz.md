# 选择


---
从本章起，参照第10版，而非前两章的第8版。
---

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