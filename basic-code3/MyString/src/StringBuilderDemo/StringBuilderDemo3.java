package StringBuilderDemo;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //链式编程：
        //当我们在调用一个方法时，不需要用变量来接收它的结果，可以继续调用其他的方法
        int length = getString().substring(1).replace("A", "D").length();
        System.out.println(length);
    }
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入输入一个字符串：");
        String str = sc.next();
        return str;
    }
}
