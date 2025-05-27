package Operator;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //输入两个数,比较大小
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的数字");
        int mynumber = sc.nextInt();
        System.out.println("请输入另一个人的数字");
        int othernumber = sc.nextInt();
        boolean result = mynumber > othernumber;
        System.out.println(result);

    }
}
