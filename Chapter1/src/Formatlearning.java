import java.util.Date;

public class Formatlearning {

    public static void main(String[] args){
        //System.out.printf("%1$s = %2$s %2$s%n", "Name", "San", "Zhang");
        System.out.printf("%S = %s%n", "Name", "Zhangsan");
        //%n是换行的意思
        System.out.printf("%-15s%n%-15s%n%-15s%n", "dadk", "dafadfa", "dafadfa");
        //-代表左对齐，没有的代表右对齐
        System.out.printf("%-15s%-15s%-15s", "dadk", "dafadfa", "dafadfa");
        //循环格式输出
        for (int a = 0; a<5; a++) System.out.format("%-5s%-5s%-5s%n", 5,25,a);
        for (int a = 0; a<5; a++) System.out.printf("%-5s%-5s%-5s%n", 5,25,a);
        //
        System.out.println("Hallo,Leo!");
        System.out.printf("%15s","Hallo,Leo!");
        System.out.printf("%15s","Hallo,Leo!");

    }
}
