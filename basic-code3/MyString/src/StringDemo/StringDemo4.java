package StringDemo;

import java.util.Scanner;
//length()：返回字符串的长度
//注意这里调用length时和数组的区别 length是数组对象的一个属性，
//而length()是String的一个方法
//charAt(int index)：根据索引返回索引对应的字符
public class StringDemo4 {
    public static void main(String[] args) {
        //键盘录入一个字符串，并在控制台遍历该字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //str.length().fori
        for (int i = 0; i < str.length(); i++) {
            //这里的i就是字符串索引
            char c = str.charAt(i);
            if (i == (str.length() - 1)) {
                System.out.print(c);
            } else {
                System.out.print(c + " ");
            }
        }
    }
}
