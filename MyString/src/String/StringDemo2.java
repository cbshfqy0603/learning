package String;

import java.util.Scanner;

//拓展：== 号比较的是什么
//（1）基本数据类型；比较的是数据值
//（2）引用数据类型：比较的是地址值
public class StringDemo2 {
    public static void main(String[] args) {
        //String对象的常用方法（比较）
        //传统的 == 号比较
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true 地址值相同
        String s3 = "abc";
        String s4 = new String("abc");
        System.out.println(s3 == s4);//false 地址值不同
        // 同理两个利用new出来的字符串虽然可能内容相同，但是地址值一定不同
        //使用equals()和equalsIngnoreCase()来比较字符串的内容是否相等
        //比较字符串的内容（不忽略大小写）
        String s5 = "abc";
        //String s5 = "Abc"; -> 打印false 不区分大小写
        String s6 = new String("abc");
        boolean result1 = s5.equals(s6);
        System.out.println(result1);//true
        //比较字符串的大小写（忽略大小写）
        //此处的忽略大小写不区分中文的大小写 例如：1 一 壹
        //只区分英文的大小写
        String s7 = new String("ABC");
        String s8 = new String("abc");
        boolean result2 = s7.equalsIgnoreCase(s8);
        System.out.println(result2);//true
        //试问：假如我键盘录入一个 abc 和我定义一个 abc 两者用 == 号比较 结果如何？
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        //ctrl + b 跟进源码
        String str1 = sc.next();// abc 键盘录入最终得到的字符串是new出来的
        String str2 = "abc";
        System.out.println(str1 == str2);//false
        //结论：以后想比较字符串里面的内容，就必须使用String里面的方法
    }
}
