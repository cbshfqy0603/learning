package StringBuilder;

import java.util.Scanner;

public class StringBuilderDemo4 {
    //使用StringBuilder的场景：
    //(1)字符串的拼接
    //(2)字符串的反转
    public static void main(String[] args) {
        //需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或者不是
        //对称字符串：123321 111
        //非对称字符串：123123
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //将字符串进行反转
        String result = new StringBuilder().append(str).reverse().toString();
        //将原字符串的内容和反转后字符串的内容进行比较
        if (str.equals(result)) {
            System.out.println("该字符串是对称字符串");
        } else {
            System.out.println("该字符串不是对称字符串");
        }
    }
}
