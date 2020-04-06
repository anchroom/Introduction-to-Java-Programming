#数学函数、字符和字符串

## 常用数学函数
  
  1. Math.pow,
  2. Math.sqrt
  3. ceil
  4. floor
  5. rint, 四舍五入，但返回的是double，5的时候返回的是偶数
  6. round，四舍五入，如果输入是int, 输出也是int；如果输入是double， 输出是long
  7. Math.toRadians() ，输出的是以PI为基础计算出来的弧度角的double 值
  
## 常用字符函数

1. isDigit
2. isLetter
3. charAt(index)
4. trim() ，仅是删除两端的空白字符和转义字符，而不是中间的
5. equals(s1)
6. equalsIgnoreCase(s1)
7. compareTo(s1)
8. startsWith(prefix)
9. endsWith(suffix)
10. contains(s1)
11. indexOf(ch,fromIndex)
12. lastIndexOf()
13. parse...() 从字符串向其它类型的转化

## 关于二进制格式的相关问题

### 关于进制数赋值的问题
默认情况下，整型直接量是一个十进制整数。要表示一个二进制整数直接量，使用
Ob 或者0B ( 零B) 开头；表示一个八进制整數直接量，就用0 ( 零）开头，而要表示一个
十六进制整数直接量，就用Ox 或0X ( 零x) 开头。例如，
```java
byte value = (byte) 24;

System.out.println(OB1111); // Displays 15
System.out,print1n(07777); // Displays 4095
System.out.println(OXFFFF); // Displays 65535

```

### byte to int


### byte 的输出问题
二进制输出不是以数的形式，而是以字符串的形式
```java
byte ivalue = (byte)24;
String binaryString = Integer.toBinaryString(ivalue);
System.out.println("binaryString = " + binaryString);
```


