package Arithmeticoperator;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //任意输入一个三位数，分别打印出它的个位，十位，百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
        System.out.println(number % 10);
        System.out.println(number /10 %10);
        System.out.println(number /100 %10);
    }
}
