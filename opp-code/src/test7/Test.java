package test7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入：
        //第一套体系：
        //nextInt(); 接收整数
        //nextDouble(); 接受小数
        //next(); 接受字符串
        //遇到空格，制表符，回车就停止接受数据，这些符号后面的数据就不会别接收了

        //第二套体系
        //nextLine(); 接收字符串
        //可以接受空格，制表符，遇到回车就停止接受数据

//        //nextInt();
//        Scanner sc = new Scanner(System.in);
//        //alt + enter 自动补全
//        System.out.println("请输入第一个整数：");
//        //假如我输入 123 456
//        int num1 = sc.nextInt();
//        System.out.println(num1);//123
//        System.out.println("请输入第二个整数：");
//        int num2 = sc.nextInt();
//        System.out.println(num2);//456

//        //next();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个字符串：");
//        //假如我输入abc def
//        String str1 = sc.next();
//        System.out.println(str1);//abc
//        System.out.println("请输入第二个字符串：");
//        String str2 = sc.next();
//        System.out.println(str2);//efg

//        //nextLine();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个字符串：");
//        String str1 = sc.nextLine();
//        System.out.println(str1);
//        System.out.println("请输入第二个字符串：");
//        String str2 = sc.nextLine();
//        System.out.println(str2);

        //键盘录入的两套体系最好不要混用
        //弊端：先用nextInt()，再用nextLine().会导致下面的nextLLine()接受不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        //(1)假如我输入123 456
        //(2)假如我输入123 + enter
        int num = sc.nextInt();//(1)123 (2)123
        System.out.println(num);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();//(1) 456 (2)enter
        System.out.println(str);
        String str2 = sc.nextLine();
    }
}
