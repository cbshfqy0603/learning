package ProcessControl;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //判断质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数:");
        int number = sc.nextInt();
        //标志:true代表是质数 false代表不是质数
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        //注此处输入2 结果也是对的
        if (flag) {
            System.out.println("是质数");
        } else {
            System.out.println("不是质数");
        }
    }
}
